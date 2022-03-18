-- Sp para obtener los datos de perfil de un usuario
CREATE PROCEDURE `sp_Usuario_ObtenerDatosPerfil`(
    IN _IdUsuario INT
)
BEGIN

   SELECT Usuarios.Imagen, Usuarios.Nombre, Usuarios.Paterno, Usuarios.Materno, Usuarios.CorreoElectronico, 
   Usuarios.Genero, Usuarios.TipoUsuario, Usuarios.FechaNacimiento, Usuarios.Descripcion, 
   CONCAT(Localidades.Localidad,', ',Localidades.Estado) As Localidad, Usuarios.PromedioGeneral
   FROM tb_usuarios Usuarios INNER JOIN tb_localidades Localidades ON Usuarios.IdLocalidad = Localidades.IdLocalidad
   WHERE Usuarios.IdUsuario = _IdUsuario AND Usuarios.Activo = 1;

END;

-- Sp para obtener los intereses de un usuario
CREATE PROCEDURE `sp_Usuario_ObtenerIntereses`(
    IN _IdUsuario INT
)
BEGIN

   SELECT Tematicas.Tematica FROM tb_tematicas Tematicas 
   INNER JOIN  tb_tematicasusuarios TematicasUsuarios ON Tematicas.IdTematica = TematicasUsuarios.IdTematica
   INNER JOIN tb_usuarios Usuarios ON Usuarios.IdUsuario = TematicasUsuarios._IdUsuario
   WHERE Usuarios.IdUsuario = _IdUsuario AND Usuarios.Activo = 1 AND Usuarios.TipoUsuario = 'Estudiante';
   
END;

CREATE PROCEDURE `sp_Usuario_ActualizarDatosAutenticacion`(
    IN _IdUsuario INT,
    IN _CorreoElectronico VARCHAR(150),
    IN _Contrasenia VARCHAR(256)
)
BEGIN

    -- Validar que los campos de correo y contrasena no sean nulos o vacios:
    IF _CorreoElectronico IS NULL OR LENGTH(_CorreoElectronico) = 0 
		OR _Contrasenia IS NULL OR LENGTH(_Contrasenia) = 0  THEN
        SELECT 0 AS "Codigo", 'El Correo Electrónico O La Contrasena Estan Vacios' AS "Mensaje";
	ELSE

        -- Validar que exista el usuario:
        IF EXISTS (SELECT IdUsuario FROM tb_usuarios WHERE IdUsuario = _IdUsuario AND Activo = 1) THEN

            -- Validar que el correo electronico no exista a otro usuario activo:

            IF NOT EXISTS (SELECT CorreoElectronico FROM tb_usuarios WHERE IdUsuario <> _IdUsuario AND Activo = 1) THEN

                UPDATE tb_usuarios SET CorreoElectronico = _CorreoElectronico,
                Contrasenia = _Contrasenia WHERE IdUsuario = _IdUsuario;

                SELECT 1 AS "Codigo", 'OK' AS "Mensaje";

            ELSE
                SELECT 0 AS "Codigo", 'El Correo Electronico Ya Se Encuentra Registrado' AS "Mensaje";
            END IF;

        ELSE
            SELECT 0 AS "Codigo", 'El Usuario No Se Encuentra Registrado' AS "Mensaje";
        END IF;

    END IF;

END;

CREATE PROCEDURE `sp_Usuario_ActualizarInformacionExtra`(
    IN _IdUsuario INT,
    IN _PromedioGeneral FLOAT,
    IN _Descripcion TEXT
    )
BEGIN
    IF _PromedioGeneral IS NOT NULL AND (_PromedioGeneral < 0 AND _PromedioGeneral > 100)  
        SELECT 0 AS "Codigo", 'El Promedio General No Tiene El Formato Adecuado' AS "Mensaje";
	ELSE
        IF EXISTS (SELECT IdUsuario FROM tb_usuarios WHERE IdUsuario = _IdUsuario AND Activo = 1) THEN
            UPDATE tb_usuarios SET PromedioGeneral = _PromedioGeneral,
            Descripcion = _Descripcion WHERE IdUsuario = _IdUsuario;
            SELECT 1 AS "Codigo", 'OK' AS "Mensaje";
        ELSE
            SELECT 0 AS "Codigo", 'El Usuario No Se Encuentra Registrado' AS "Mensaje";
        END IF;

    END IF;

END;


CREATE PROCEDURE `sp_Usuario_AgregarInteres`(
    IN _IdUsuario INT,
    IN _Tematica VARCHAR(45)
)
BEGIN

    DECLARE _IdTematica INT = NULL;

    -- Validar que exista el usuario:
    IF EXISTS (SELECT IdUsuario FROM tb_usuarios WHERE IdUsuario = _IdUsuario AND Activo = 1 AND TipoUsuario = 'Estudiante') THEN
        
        -- Validar que exista la tematica:
        SELECT _IdTematica = IdTematica FROM tb_tematicas WHERE Tematica = _Tematica;
        IF _IdTematica IS NOT NULL AND _IdTematica > -1 THEN
            
            -- Validar que no exista la relacion:
            IF NOT EXISTS (SELECT IdTematica FROM tb_tematicasusuarios WHERE IdTematica = _IdTematica and IdUsuario = _IdUsuario) THEN

                INSERT INTO tb_tematicasusuarios VALUES (_IdTematica, _IdUsuario);
                SELECT 1 AS "Codigo", 'OK' AS "Mensaje";

            ELSE 
                SELECT 0 AS "Codigo", 'La Tematica Ya Se Encuentra Registrada En Ese Usuario' AS "Mensaje";
            END IF;

        ELSE
            SELECT 0 AS "Codigo", 'La Tematica No Se Encuentra Registrada' AS "Mensaje";
        END IF;
        
    ELSE
        SELECT 0 AS "Codigo", 'El Usuario No Se Encuentra Registrado' AS "Mensaje";
    END IF;
END;

CREATE PROCEDURE `sp_Usuario_RemoverInteresTematica`(
    IN _IdUsuario INT,
    IN _Tematica VARCHAR(45)
)
BEGIN

    DECLARE _IdTematica INT = NULL;

    -- Validar que exista el usuario:
    IF EXISTS (SELECT IdUsuario FROM tb_usuarios WHERE IdUsuario = _IdUsuario AND Activo = 1) THEN
        
        -- Validar que exista la tematica:
        SELECT _IdTematica = IdTematica FROM tb_tematicas WHERE Tematica = _Tematica;
        IF _IdTematica IS NOT NULL AND _IdTematica > -1 THEN
            
            -- Validar que exista la relacion:
            IF EXISTS (SELECT IdTematica FROM tb_tematicasusuarios WHERE IdTematica = _IdTematica and IdUsuario = _IdUsuario) THEN

                DELETE FROM  tb_tematicasusuarios WHERE IdTematica =  _IdTematica AND IdUsuario = _IdUsuario;
                SELECT 1 AS "Codigo", 'OK' AS "Mensaje";

            ELSE 
                SELECT 0 AS "Codigo", 'La Tematica No Se Encuentra Registrada En Ese Usuario' AS "Mensaje";
            END IF;

        ELSE
            SELECT 0 AS "Codigo", 'La Tematica No Se Encuentra Registrada' AS "Mensaje";
        END IF;
        
    ELSE
        SELECT 0 AS "Codigo", 'El Usuario No Se Encuentra Registrado' AS "Mensaje";
    END IF;

END;

CREATE PROCEDURE `sp_Usuario_ActualizarDatosPersonales`(
    IN _IdUsuario INT,
    IN _Nombre VARCHAR(50),
    IN _Paterno VARCHAR(30),
    IN _Materno VARCHAR(30),
    IN _Genero VARCHAR(25),
    IN _FechaNacimiento VARCHAR(100)
)
BEGIN
    IF _Nombre IS NULL OR LENGTH(_Nombre) = 0 
		OR _Paterno IS NULL OR LENGTH(_Paterno) = 0  
        OR _FechaNacimiento IS NULL OR LENGTH(_FechaNacimiento) = 0 THEN
        SELECT 0 AS "Codigo", 'Alguno De Los Campos Esta Vacios' AS "Mensaje";
	ELSE
        IF EXISTS (SELECT IdUsuario FROM tb_usuarios WHERE IdUsuario = _IdUsuario AND Activo = 1) THEN
            UPDATE tb_usuarios SET Nombre = _Nombre, Paterno = _Paterno,
            Materno = _Materno, Genero = _Genero,
            FechaNacimiento = _FechaNacimiento WHERE IdUsuario = _IdUsuario;

            SELECT 1 AS "Codigo", 'OK' AS "Mensaje";
        ELSE
            SELECT 0 AS "Codigo", 'El Usuario No Se Encuentra Registrado' AS "Mensaje";
        END IF;

    END IF;

END;

CREATE PROCEDURE `sp_Usuario_ActualizarLocalidad`(
    IN _IdUsuario INT,
    IN _Estado VARCHAR(100),
    IN _Localidad VARCHAR(200)
)
BEGIN
    DECLARE _IdLocalidad INT = NULL;
    
    -- Validar que exista la localidad:
    SELECT _IdLocalidad = IdLocalidad FROM tb_localidades WHERE Localidad = _Localidad AND Estado = _Estado;
    
    IF _IdLocalidad IS NOT NULL AND _IdLocalidad > -1 THEN
    
        -- Validar que exista el usuario:
        IF EXISTS (SELECT IdUsuario FROM tb_usuarios WHERE IdUsuario = _IdUsuario AND Activo = 1) THEN
        
            UPDATE tb_usuarios SET IdLocalidad = _IdLocalidad WHERE IdUsuario = _IdUsuario;
            SELECT 1 AS "Codigo", 'OK' AS "Mensaje";
        ELSE
            SELECT 0 AS "Codigo", 'El Usuario No Se Encuentra Registrado' AS "Mensaje";
        END IF;
    ELSE
        SELECT 0 AS "Codigo", 'La Localidad No Se Encuentra Registrada' AS "Mensaje";
    END IF;
    
END;

CREATE PROCEDURE `sp_ExisteUsuario`(
    IN _CorreoElectronico VARCHAR(150),
    IN _Contrasenia VARCHAR(256)
)
BEGIN
    IF _CorreoElectronico IS NULL OR LENGTH(_CorreoElectronico = 0 
		OR _Contrasenia IS NULL OR LENGTH(_Contrasenia) = 0 THEN
        SELECT 0 AS "Codigo", 'Alguno De Los Campos Esta Vacios' AS "Mensaje";
    ELSE
        DECLARE _IdUsuario INT = NULL;
        SELECT _IdUsuario = IdUsuario FROM tb_usuarios WHERE CorreoElectronico = _CorreoElectronico AND Contrasenia = _Contrasenia AND Activo = 1;

        IF _IdUsuario IS NOT NULL AND _IdUsuario > -1 THEN
            SELECT _IdUsuario AS "Codigo", 'OK' AS "Mensaje";
        ELSE
            SELECT 0 AS "Codigo", 'El Usuario Si Se Encuentra Registrado' AS "Mensaje";
        END IF;
    END IF;
END;


CREATE PROCEDURE `sp_AgregarUsuario`(
    IN _CorreoElectronico VARCHAR(150),
    IN _Contrasenia VARCHAR(256),
    IN _Nombre VARCHAR(50),
    IN _Paterno VARCHAR(30),
    IN _Materno VARCHAR(30),
    IN _Genero VARCHAR(25),
    IN _FechaNacimiento VARCHAR(100)
    IN _PromedioGeneral FLOAT,
    IN _TipoUsuario VARCHAR(30),
    IN _Descripcion TEXT,
    IN _Imagen MEDIUMBLOB
)
BEGIN

    DECLARE _IdUsuario INT = NULL;
    IF _CorreoElectronico IS NULL OR LENGTH(_CorreoElectronico) = 0 
		OR _Contrasenia IS NULL OR LENGTH(_Contrasenia) = 0  
        OR _Nombre IS NULL OR LENGTH(_Nombre) = 0 
		OR _Paterno IS NULL OR LENGTH(_Paterno) = 0
        OR _FechaNacimiento IS NULL OR LENGTH(_FechaNacimiento) = 0 
        OR _TipoUsuario <> 'Estudiante' OR _TipoUsuario <> 'Profesor' THEN

            SELECT 0 AS "Codigo", 'Alguno De Los Datos Esta Vacio' AS "Mensaje"; 
    ELSE

        IF NOT EXISTS (SELECT CorreoElectronico FROM tb_usuarios WHERE Activo = 1) THEN
            IF _PromedioGeneral IS NOT NULL _PromedioGeneral >= 0 AND _PromedioGeneral <= 100 THEN
                IF _TipoUsuario = 'Estudiante' THEN
                     INSERT INTO tb_usuarios (CorreoElectronico, Contrasenia, Nombre, Paterno, Materno, Genero, FechaNacimiento, 
                    PromedioGeneral, Descripcion, Imagen)
                    VALUES (_CorreoElectronico, _Contrasenia, _Nombre, _Paterno, _Materno, _Genero, _FechaNacimiento,
                    _PromedioGeneral, _TipoUsuario, _Descripcion, _Imagen);

                    SELECT _IdUsuario = IdUsuario FROM tb_usuarios WHERE CorreoElectronico = _CorreoElectronico;
            
                    SELECT _IdUsuario AS "Codigo", 'OK' AS "Mensaje";

                ELSE
                    SELECT 0 AS "Codigo", 'El promedio General No Es Aceptado Para Este Tipo De Usuario' AS "Mensaje";  
                END IF;

            END IF;

        ELSE
            SELECT 0 AS "Codigo", 'El Correo Electronico Ya Se Encuentra Registrado' AS "Mensaje";
        END IF;  
       
    END IF;
END;

CREATE PROCEDURE `sp_ObtenerDatosSesion`(
    IN _IdUsuario INT
)
BEGIN

    IF EXISTS (SELECT IdUsuario FROM tb_usuarios WHERE IdUsuario = _IdUsuario AND Activo = 1) THEN

        SELECT IdSesion, CONCAT(Dispositivo,' - ',Fabricante) As Dispositivo, Uuid, UltimaConexion, Activo FROM tb_sesiones 
        WHERE IdUsuario = _IdUsuario ORDER BY IdSesion DESC LIMIT 10;

    ELSE
        SELECT 0 AS "Codigo", 'El Usuario No Se Encuentra Registrado' AS "Mensaje";
    END IF; 

END;


CREATE PROCEDURE `sp_ObtenerAvisos`(
    IN _IdUsuario INT
)
BEGIN 

    IF EXISTS (SELECT IdUsuario FROM tb_usuarios WHERE IdUsuario = _IdUsuario AND Activo = 1) THEN
        
        SELECT IdAviso, TipoAviso, Aviso, FechaEnvio FROM tb_avisos WHERE IdUsuario = _IdUsuario 
        ORDER BY IdAviso DESC LIMIT 100;
        
    ELSE 

        SELECT 0 AS "Codigo", 'El Usuario No Se Encuentra Registrado' AS "Mensaje";

    END IF;

END;

CREATE PROCEDURE `sp_ObtenerTareasEstudiante`(
    IN _IdUsuario INT
)
BEGIN

    IF EXISTS (SELECT IdUsuario FROM tb_usuarios WHERE IdUsuario = _IdUsuario AND Activo = 1 AND TipoUsuario = 'Estudiante') THEN
        
        SELECT Tareas.IdTarea, Tareas.Nombre, Cursos.IdCurso, Cursos.Imagen, Cursos.Nombre, Tareas.FechaCreacion, Tareas.FechaEntrega, TareasCursoUsuarios.Estatus
        FROM tb_tareas Tareas
        INNER JOIN tb_cursos Cursos ON Cursos.IdCurso = Tareas.IdCurso
        INNER JOIN tb_tareascursousuarios TareasCursoUsuarios ON TareasCursoUsuarios.IdTarea = Tareas.IdTarea 
        AND TareasCursoUsuarios.IdUsuario = _IdUsuario
        WHERE Tareas.Activo = 1 ORDER BY Tareas.IdTarea DESC LIMIT 100;
        
    ELSE 

        SELECT 0 AS "Codigo", 'El Usuario No Se Encuentra Registrado' AS "Mensaje";

    END IF;

END;

CREATE PROCEDURE `sp_ObtenerGrupos`(
    IN _IdUsuario INT
)
BEGIN

    IF EXISTS (SELECT IdUsuario FROM tb_usuarios WHERE IdUsuario = _IdUsuario AND Activo = 1 AND TipoUsuario = 'Estudiante') THEN
        
        SELECT Grupo.IdGrupo, Grupo.Imagen, Grupo.Nombre, Curso.IdCurso, Curso.Imagen, Curso.Nombre, Grupo.FechaCreacion 
        FROM tb_grupos Grupo
        INNER JOIN tb_cursos Curso ON Curso.IdCurso = Grupo.IdCurso
        INNER JOIN tb_usuariosgrupos UsuarioGrupo ON UsuarioGrupo.IdUsuario = _IdUsuario AND UsuarioGrupo.IdGrupo = Grupo.IdGrupo
        AND UsuarioGrupo.IntentosRemover < (SELECT COUNT(Grupos.IdGrupo) )
        ORDER BY Grupo.IdGrupo DESC LIMIT 100;
        
    ELSE 

        SELECT 0 AS "Codigo", 'El Usuario No Se Encuentra Registrado' AS "Mensaje";

    END IF;

END;

CREATE PROCEDURE `sp_ObtenerChats`(
    IN _IdUsuario INT
)
BEGIN 

    IF EXISTS (SELECT IdUsuario FROM tb_usuarios WHERE IdUsuario = _IdUsuario AND Activo = 1) THEN
        
        SELECT Chats.IdChat, Usuarios.Imagen, CONCAT(Usuarios.Nombre,' ',Usuarios.Paterno,' ',Usuarios.Materno) As NombreCompleto, 
        Chats.FechaCreacion FROM tb_chatspersonales Chats
        INNER JOIN tb_usuarios Usuarios ON Usuarios.IdUsuario = Chats.IdUsuarioEmisor 
        WHERE Chats.Activo = 1 AND Chats.IdUsuarioReceptor = _IdUsuario ORDER BY Chats.IdChat DESC LIMIT 100;

    ELSE 

        SELECT 0 AS "Codigo", 'El Usuario No Se Encuentra Registrado' AS "Mensaje";

    END IF;

END;

CREATE PROCEDURE `sp_ObtenerUltimoMensajeChat`(
    IN _IdChat INT
)
BEGIN 

    IF EXISTS (SELECT IdChat FROM tb_chats WHERE IdChat = _IdChat AND Activo = 1) THEN
        
        SELECT Mensaje FROM tb_mensajeschat WHERE 

    ELSE 

        SELECT 0 AS "Codigo", 'El Usuario No Se Encuentra Registrado' AS "Mensaje";

    END IF;
END;

CREATE PROCEDURE `sp_ObtenerPreguntas`(
    IN _IdUsuario INT
)
BEGIN 

    IF EXISTS (SELECT IdUsuario FROM tb_usuarios WHERE IdUsuario = _IdUsuario AND Activo = 1) THEN
        
        SELECT Preguntas.IdPregunta, Usuarios.Imagen, CONCAT(Usuarios.Nombre,' ',Usuarios.Paterno,' ',Usuarios.Materno) As NombreCompleto, Preguntas.Pregunta, Preguntas.Descripcion, Preguntas.FechaCreacion, Preguntas.Estatus 
        FROM tb_preguntas Preguntas
        INNER JOIN tb_usuarios Usuarios ON Usuarios.IdUsuario = Preguntas.IdUsuario AND Usuarios.IdUsuario = _IdUsuario
        ORDER BY Preguntas.IdPregunta DESC LIMIT 100;
        
    ELSE 

        SELECT 0 AS "Codigo", 'El Usuario No Se Encuentra Registrado' AS "Mensaje";

    END IF;

END;

CREATE PROCEDURE `sp_BuscarPreguntas`(
    IN _Busqueda VARCHAR (250)
)
BEGIN 

    IF _Busqueda IS NULL OR LENGTH(_Busqueda) = 0 THEN
        SELECT 0 AS "Codigo", 'El Campo Busqueda Esta Vacio' AS "Mensaje";
    ELSE
        SELECT Preguntas.IdPregunta, Usuarios.Imagen, CONCAT(Usuarios.Nombre,' ',Usuarios.Paterno,' ',Usuarios.Materno) As NombreCompleto, Preguntas.Pregunta, Preguntas.Descripcion, Preguntas.FechaCreacion, Preguntas.Estatus 
        FROM tb_preguntas Preguntas
        INNER JOIN tb_usuarios Usuarios ON Usuarios.IdUsuario = Preguntas.IdUsuario
        WHERE ;
        Preguntas.Pregunta LIKE CONCAT('%',_Busqueda,'%')
        OR Usuarios.Nombre LIKE CONCAT('%',_Busqueda,'%') LIMIT 100;
    END IF;
  
END;

CREATE PROCEDURE `sp_BuscarGrupos`(
    IN _Busqueda VARCHAR(250)
)
BEGIN

    IF _Busqueda IS NULL OR LENGTH(_Busqueda) = 0 THEN
        SELECT 0 AS "Codigo", 'El Campo Busqueda Esta Vacio' AS "Mensaje";
	ELSE
        SELECT Grupo.IdGrupo, Grupo.Imagen, Grupo.Nombre, Curso.IdCurso, Curso.Imagen, Curso.Nombre, Grupo.FechaCreacion 
        FROM tb_grupos Grupo
        INNER JOIN tb_cursos Curso ON Curso.IdCurso = Grupo.IdCurso
        WHERE 
        Grupo.Nombre LIKE CONCAT('%',_Busqueda,'%')
        OR Curso.Nombre LIKE CONCAT('%',_Busqueda,'%') LIMIT 100;
    END IF;

END;

CREATE PROCEDURE `sp_BuscarChats`(
    IN _Busqueda VARCHAR(250),
    IN _IdUsuario INT
)
BEGIN

    IF _Busqueda IS NULL OR LENGTH(_Busqueda) = 0 THEN
        SELECT 0 AS "Codigo", 'El Campo Busqueda Esta Vacio' AS "Mensaje";
	ELSE

        IF EXISTS (SELECT IdUsuario FROM tb_usuarios WHERE IdUsuario = _IdUsuario AND Activo = 1) THEN

            SELECT ChatPersonal.IdChat, Usuario.Imagen, CONCAT(Usuario.Nombre,' ',Usuario.Paterno,' ',Usuario.Materno) AS NombreCompleto, ChatPersonal.FechaCreacion 
            FROM tb_chatspersonales ChatPersonal
            INNER JOIN tb_usuarios Usuario ON ChatPersonal.IdUsuarioEmisor = Usuario.IdUsuario
            WHERE ChatPersonal.IdUsuarioEmisor = _IdUsuario OR ChatPersonal.IdUsuarioReceptor = _IdUsuario
            CONCAT(Usuario.Nombre,' ',Usuario.Paterno,' ',Usuario.Materno) LIKE CONCAT('%',_Busqueda,'%') LIMIT 100;

        ELSE 
            SELECT 0 AS "Codigo", 'El Usuario No Se Encuentra Registrado' AS "Mensaje";
        END IF;

    END IF;

END;