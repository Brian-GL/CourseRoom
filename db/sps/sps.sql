CREATE DEFINER=`courseroom_server`@`localhost` PROCEDURE `sp_ObtenerImagenPerfil`(IN _IdUsuario INT)
BEGIN
	SELECT Imagen FROM tb_usuarios WHERE IdUsuario = _IdUsuario AND Activo = 1;
END

CREATE PROCEDURE `sp_ObtenerImagenGrupo` (IN _IdGrupo INT)
BEGIN
    SELECT Imagen FROM tb_grupos WHERE IdGrupo = _IdGrupo AND Activo = 1;
END

CREATE PROCEDURE `sp_ObtenerImagenPregunta` (IN _IdPregunta INT)
BEGIN
    
    SELECT @IdUsuario := IdUsuario AS Imagen FROM tb_preguntas WHERE IdPregunta = _IdPregunta AND Activo = 1;
    CALL courseroom.`sp_ObtenerImagenPerfil`(@IdUsuario);
END

CREATE PROCEDURE `sp_ObtenerImagenCurso` (IN _IdCurso INT)
BEGIN
    SELECT Imagen FROM tb_cursos WHERE IdCurso = _IdCurso AND Activo = 1;
END

CREATE PROCEDURE `sp_ObtenerDatosGrupo` (IN _IdGrupo INT)
BEGIN
    SELECT Grupos.Nombre, Grupos.Descripcion, Grupos.FechaCreacion, Cursos.IdCurso, Cursos.Nombre AS NombreCurso
    FROM tb_grupos Grupos 
    INNER JOIN tb_cursos Cursos ON Grupos.IdCurso = Cursos.IdCurso
    WHERE Grupos.IdGrupo = _IdGrupo And Grupos.Activo = 1;
END

CREATE PROCEDURE `sp_ObtenerMiembrosGrupo` (IN _IdGrupo INT)
BEGIN
    SELECT courseroom.fn_NombreCompleto(Usuarios.Nombre, Usuarios.Paterno, Usuarios.Materno) AS NombreCompleto,
    UsuariosGrupos.FechaIngreso, UsuariosGrupos.Intentos FROM tb_usuariosgrupos UsuariosGrupos
    INNER JOIN tb_usuarios Usuarios ON UsuariosGrupos.IdUsuario = Usuarios.IdUsuario
    WHERE UsuariosGrupos.IdGrupo = _IdGrupo;
END

CREATE PROCEDURE `sp_EnviarArchivoCompartidoGrupo` (
    IN _IdGrupo INT,
    IN _IdUsuario INT,
    IN _NombreArchivo VARCHAR(100),
    IN _Archivo LONGBLOB,
    IN _Extension VARCHAR(100)
)
BEGIN
    IF courseroom.fn_CampoValido(_NombreArchivo) = 1 AND corseroom.fn_CampoValido(_Extension) = 1 THEN

        IF EXISTS(SELECT IdGrupo FROM tb_grupos WHERE IdGrupo = _IdGrupo AND Activo = 1) THEN

            IF courseroom.fn_ExisteUsuario(_IdUsuario) = 1 THEN

                INSERT INTO tb_archivoscompartidosgrupos (NombreArchivo, Archivo, Extension, FechaSubido, IdUsuario, IdGrupo, Activo)
                VALUES (_NombreArchivo, _Archivo, _Extension, courseroom.fn_ObtenerFecha(),_IdUsuario, _IdGrupo, 1);

                SELECT LAST_INSERT_ID() AS "Codigo", 'OK' AS "Mensaje";
            ELSE 
                SELECT -1 AS "Codigo", 'El Usuario No Se Encuentra Registrado' AS "Mensaje";
            END IF;

        ELSE 
            SELECT -1 AS "Codigo", 'El Grupo No Se Encuentra Registrado' AS "Mensaje";
        END IF;

    ELSE 
        SELECT -1 AS "Codigo", 'Algún Campo No Tiene El Formato Valido' AS "Mensaje";
    END IF;
    
END

CREATE PROCEDURE `sp_RemoverArchivoCompartidoGrupo`(
    IN _IdArchivoCompartido INT,
    IN _IdUsuario INT,
    IN _IdGrupo INT
)
BEGIN
    
    IF EXISTS(SELECT IdArchivoCompartido FROM tb_archivoscompartidosgrupos WHERE IdArchivoCompartido = _IdArchivoCompartido 
        AND Activo = 1 AND IdGrupo = _IdGrupo AND IdUsuario = _IdUsuario) THEN 

        UPDATE tb_archivoscompartidosgrupos SET Activo = 0 WHERE IdGrupo = _IdGrupo AND IdUsuario = _IdUsuario
        AND IdArchivoCompartido = _IdArchivoCompartido;

        SELECT 1 AS "Codigo", 'OK' AS "Mensaje";

    ELSE
        SELECT -1 AS "Codigo", 'El Archivo Compartido No Existe' AS "Mensaje";
    END IF;
END


CREATE PROCEDURE `sp_AgregarTareaPendienteGrupo`(
    IN _Nombre VARCHAR(100),
    IN _Descripcion TEXT,
    IN _FechaFinalizacion VARCHAR(100),
    IN _Estatus VARCHAR(15),
    IN _IdUsuarioACargo INT,
    IN _IdGrupo INT
)
BEGIN

    IF courseroom.fn_CampoValido(_Nombre) = 1 AND courseroom.fn_CampoValido(_Descripcion) = 1 THEN
        IF EXISTS(SELECT IdGrupo FROM tb_grupos WHERE IdGrupo = _IdGrupo AND Activo = 1) THEN

            IF courseroom.fn_ExisteUsuario(_IdUsuarioACargo) = 1 THEN
                INSERT INTO tb_tareaspendientesgrupos (Nombre, Descripcion, FechaCreacion, FechaFinalizacion, Estatus, IdUsuarioACargo, IdGrupo)
                VALUES (_Nombre, _Descripcion, courseroom.fn_ObtenerFecha(), _FechaFinalizacion, _Estatus, _IdUsuarioACargo, _IdGrupo);

                SELECT LAST_INSERT_ID() AS "Codigo", 'OK' AS "Mensaje";
            ELSE 
                SELECT -1 AS "Codigo", 'El Usuario A Cargo No Se Encuentra Registrado' AS "Mensaje";
            END IF;

        ELSE 
            SELECT -1 AS "Codigo", 'El Grupo No Se Encuentra Registrado' AS "Mensaje";
        END IF;
    ELSE
        SELECT -1 AS "Codigo", 'Algún Campo De Entrada No Es Valido' AS "Mensaje";
    END IF;
END

CREATE PROCEDURE `sp_ObtenerDatosTareaPendiente`(
    IN _IdTareaPendiente INT,
    IN _IdGrupo INT
)
BEGIN

    SELECT TareaPendiente.Nombre, TareaPendiente.Descripcion, TareaPendiente.FechaCreacion, TareaPendiente.FechaFinalizacion, 
    CAST(TareaPendiente.Estatus AS CHAR) AS Estatus, courseroom.fn_NombreCompleto(Usuarios.Nombre, Usuarios.Paterno, Usuarios.Materno) AS NombreCompleto,
    TareaPendiente.Estatus FROM tb_tareaspendientesgrupos TareaPendiente
    INNER JOIN tb_usuarios Usuarios ON Usuarios.IdUsuario = TareaPendiente.IdUsuarioACargo
    WHERE TareaPendiente.IdGrupo = _IdGrupo AND TareaPendiente.IdTareaPendiente = _IdTareaPendiente LIMIT 1;

END

CREATE PROCEDURE `sp_ObtenerTareasPendientes`(
    IN _IdGrupo INT
)
BEGIN
    SELECT TareaPendiente.IdTareaPendiente, TareaPendiente.Nombre,
    courseroom.fn_NombreCompleto(Usuarios.Nombre, Usuarios.Paterno, Usuarios.Materno) AS NombreCompleto,
    CAST(TareaPendiente.Estatus AS CHAR) AS Estatus FROM tb_tareaspendientesgrupos TareaPendiente
    INNER JOIN tb_usuarios Usuarios ON Usuarios.IdUsuario = TareaPendiente.IdUsuarioACargo
    WHERE TareaPendiente.IdGrupo = _IdGrupo ORDER BY TareaPendiente.IdTareaPendiente DESC LIMIT 250;
END

CREATE PROCEDURE `sp_AbandonarGrupo`(
    IN _IdGrupo INT,
    IN _IdUsuario INT
)
BEGIN

    DECLARE _NumeroMiembros INTEGER;
    
     IF EXISTS(SELECT IdGrupo FROM tb_grupos WHERE IdGrupo = _IdGrupo AND Activo = 1) THEN

        IF courseroom.fn_ExisteUsuario(_IdUsuario) = 1 THEN

            SET _NumeroMiembros = courseroom.fn_ObtenerNumeroMiembrosGrupo(_IdGrupo);

            SET _NumeroMiembros = (_NumeroMiembros / 2) + 1;

            UPDATE tb_usuariosgrupos SET Intentos = _NumeroMiembros 
            WHERE IdUsuario = _IdUsuario AND IdGrupo = _IdGrupo;

            SELECT 1 AS "Codigo", 'OK' AS "Mensaje";

        ELSE 
            SELECT -1 AS "Codigo", 'El Usuario No Se Encuentra Registrado' AS "Mensaje";
        END IF;

    ELSE 
        SELECT -1 AS "Codigo", 'El Grupo No Se Encuentra Registrado' AS "Mensaje";
    END IF;

END

CREATE DEFINER=`courseroom_server`@`localhost` PROCEDURE `sp_ActualizarImagenGrupo`(
    IN _IdGrupo INT,
    IN _Imagen MEDIUMBLOB
)
BEGIN
    
	IF EXISTS(SELECT IdGrupo FROM tb_grupos WHERE IdGrupo = _IdGrupo AND Activo = 1) THEN
		UPDATE tb_grupos SET Imagen = _Imagen WHERE IdGrupo = _IdGrupo AND Activo = 1;
		SELECT 1 AS "Codigo", 'OK' AS "Mensaje";
	ELSE
		SELECT -1 AS "Codigo", 'El Grupo No Se Encuentra Registrado' AS "Mensaje";
	END IF;

END

CREATE PROCEDURE `sp_ActualizarDatosGeneralesGrupo`(
    IN _IdGrupo INT,
    IN _Nombre VARCHAR(80),
    IN _Descripcion TEXT
)
BEGIN

    IF courseroom.fn_CampoValido(_Nombre) = 1 AND courseroom.fn_CampoValido(_Descripcion) = 1 THEN
        IF EXISTS(SELECT IdGrupo FROM tb_grupos WHERE IdGrupo = _IdGrupo AND Activo = 1) THEN
            UPDATE tb_grupos SET Nombre = _Nombre WHERE IdGrupo = _IdGrupo AND Activo = 1;
            SELECT 1 AS "Codigo", 'OK' AS "Mensaje";
        ELSE
            SELECT -1 AS "Codigo", 'El Grupo No Se Encuentra Registrado' AS "Mensaje";
        END IF;
    ELSE
        SELECT -1 AS "Codigo", 'Algún Campo De Entrada No Es Valido' AS "Mensaje";
    END IF;
END

