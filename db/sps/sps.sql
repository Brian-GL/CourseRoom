-- Sp para obtener los datos de perfil de un usuario
CREATE PROCEDURE \`sp_Usuario_ObtenerDatosPerfil`(
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
CREATE PROCEDURE \`sp_Usuario_ObtenerIntereses`(
    IN _IdUsuario INT
)
BEGIN

   SELECT Tematicas.Tematica FROM tb_tematicas Tematicas 
   INNER JOIN  tb_tematicasusuarios TematicasUsuarios ON Tematicas.IdTematica = TematicasUsuarios.IdTematica
   INNER JOIN tb_usuarios Usuarios ON Usuarios.IdUsuario = TematicasUsuarios._IdUsuario
   WHERE Usuarios.IdUsuario = _IdUsuario AND Usuarios.Activo = 1 AND Usuarios.TipoUsuario = 'Estudiante';
   
END;

CREATE PROCEDURE \`sp_Usuario_ActualizarDatosAutenticacion`(
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

CREATE PROCEDURE \`sp_Usuario_ActualizarInformacionExtra`(
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


CREATE PROCEDURE \`sp_Usuario_AgregarInteres`(
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

CREATE PROCEDURE \`sp_Usuario_RemoverInteresTematica`(
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

CREATE PROCEDURE \`sp_Usuario_ActualizarDatosPersonales`(
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

CREATE PROCEDURE \`sp_Usuario_ActualizarLocalidad`(
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

CREATE PROCEDURE \`sp_ObtenerEstados`()
BEGIN
    SELECT Estado FROM tb_localidades;
END;

CREATE PROCEDURE \`sp_ObtenerLocalidadesPorEstado`(
    IN _Estado VARCHAR(100)
)
BEGIN
    SELECT Localidad FROM tb_localidades WHERE Estado = _Estado;
END;

CREATE PROCEDURE \`sp_ExisteUsuario`(
    IN _CorreoElectronico VARCHAR(150)
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


CREATE PROCEDURE \`sp_AgregarUsuario`(
    IN _CorreoElectronico VARCHAR(150)
    IN _Contrasenia VARCHAR(256)
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
