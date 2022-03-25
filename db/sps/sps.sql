CREATE PROCEDURE `sp_EnviarMensajeCurso`(
    IN _Mensaje TEXT,
    IN _FechaEnvio VARCHAR(100),
    IN _NombreArchivo VARCHAR(100),
    IN _Archivo LONGBLOB,
    IN _Extension VARCHAR(32),
    IN _IdUsuarioEmisor INT,
    IN _IdCurso INT
)
BEGIN

    IF courseroom.fn_CampoTextoValido(_Mensaje) = 1 THEN
        
        IF EXISTS(SELECT IdCurso FROM tb_cursos WHERE IdCurso = _IdCurso AND Activo = 1) THEN

            IF courseroom.fn_ExisteUsuario(_IdUsuarioEmisor) = 1 THEN

                INSERT INTO tb_mensajescurso (Mensaje, FechaEnvio, NombreArchivo, Archivo, Extension, IdCurso, IdUsuarioEmisor)
                VALUES (_Mensaje, _FechaEnvio, _NombreArchivo, _Archivo, _Extension, _IdCurso, _IdUsuarioEmisor);

                SELECT LAST_INSERT_ID() AS "Codigo", 'OK' AS "Mensaje";

            ELSE
                SELECT -1 AS "Codigo", 'El Curso Emisor No Se Encuentra Registrado' AS "Mensaje";
            END IF;

        ELSE
            SELECT -1 AS "Codigo", 'La Pregunta No Se Encuentra Registrada' AS "Mensaje";
        END IF;

    ELSE
        SELECT -1 AS "Codigo", 'El Mensaje No Tiene El Formato Correcto' AS "Mensaje";
    END IF;

END

CREATE PROCEDURE `sp_EnviarMensajeTarea`(
    IN _Mensaje TEXT,
    IN _FechaEnvio VARCHAR(100),
    IN _NombreArchivo VARCHAR(100),
    IN _Archivo LONGBLOB,
    IN _Extension VARCHAR(32),
    IN _IdUsuarioEmisor INT,
    IN _IdTarea INT
)
BEGIN

    IF courseroom.fn_CampoTextoValido(_Mensaje) = 1 THEN
        
        IF EXISTS(SELECT IdTarea FROM tb_tareas WHERE IdTarea = _IdTarea AND Activo = 1) THEN

            IF courseroom.fn_ExisteUsuario(_IdUsuarioEmisor) = 1 THEN

                INSERT INTO tb_mensajestareas (Mensaje, FechaEnvio, NombreArchivo, Archivo, Extension, IdTarea, IdUsuarioEmisor)
                VALUES (_Mensaje, _FechaEnvio, _NombreArchivo, _Archivo, _Extension, _IdTarea, _IdUsuarioEmisor);

                SELECT LAST_INSERT_ID() AS "Codigo", 'OK' AS "Mensaje";

            ELSE
                SELECT -1 AS "Codigo", 'El Usuario Emisor No Se Encuentra Registrado' AS "Mensaje";
            END IF;

        ELSE
            SELECT -1 AS "Codigo", 'La Tarea No Se Encuentra Registrada' AS "Mensaje";
        END IF;

    ELSE
        SELECT -1 AS "Codigo", 'El Mensaje No Tiene El Formato Correcto' AS "Mensaje";
    END IF;

END

CREATE PROCEDURE `sp_EnviarMensajeGrupo`(
    IN _Mensaje TEXT,
    IN _FechaEnvio VARCHAR(100),
    IN _NombreArchivo VARCHAR(100),
    IN _Archivo LONGBLOB,
    IN _Extension VARCHAR(32),
    IN _IdUsuarioEmisor INT,
    IN _IdGrupo INT
)
BEGIN

    IF courseroom.fn_CampoTextoValido(_Mensaje) = 1 THEN
        
        IF EXISTS(SELECT IdGrupo FROM tb_grupos WHERE IdGrupo = _IdGrupo AND Activo = 1) THEN

            IF courseroom.fn_ExisteUsuario(_IdUsuarioEmisor) = 1 THEN

                INSERT INTO tb_mensajesgrupos (Mensaje, FechaEnvio, NombreArchivo, Archivo, Extension, IdGrupo, IdUsuarioEmisor)
                VALUES (_Mensaje, _FechaEnvio, _NombreArchivo, _Archivo, _Extension, _IdGrupo, _IdUsuarioEmisor);

                SELECT LAST_INSERT_ID() AS "Codigo", 'OK' AS "Mensaje";

            ELSE
                SELECT -1 AS "Codigo", 'El Usuario Emisor No Se Encuentra Registrado' AS "Mensaje";
            END IF;

        ELSE
            SELECT -1 AS "Codigo", 'El Grupo No Se Encuentra Registrado' AS "Mensaje";
        END IF;

    ELSE
        SELECT -1 AS "Codigo", 'El Mensaje No Tiene El Formato Correcto' AS "Mensaje";
    END IF;

END

CREATE PROCEDURE `sp_EnviarMensajePregunta`(
    IN _Mensaje TEXT,
    IN _FechaEnvio VARCHAR(100),
    IN _NombreArchivo VARCHAR(100),
    IN _Archivo LONGBLOB,
    IN _Extension VARCHAR(32),
    IN _IdUsuarioEmisor INT,
    IN _IdPregunta INT
)
BEGIN

    IF courseroom.fn_CampoTextoValido(_Mensaje) = 1 THEN
        
        IF EXISTS(SELECT IdPregunta FROM tb_preguntas WHERE IdPregunta = _IdPregunta AND Activo = 1) THEN

            IF courseroom.fn_ExisteUsuario(_IdUsuarioEmisor) = 1 THEN

                INSERT INTO tb_mensajespreguntas (Mensaje, FechaEnvio, NombreArchivo, Archivo, Extension, IdPregunta, IdUsuarioEmisor)
                VALUES (_Mensaje, _FechaEnvio, _NombreArchivo, _Archivo, _Extension, _IdPregunta, _IdUsuarioEmisor);

                SELECT LAST_INSERT_ID() AS "Codigo", 'OK' AS "Mensaje";

            ELSE
                SELECT -1 AS "Codigo", 'El Usuario Emisor No Se Encuentra Registrado' AS "Mensaje";
            END IF;

        ELSE
            SELECT -1 AS "Codigo", 'La Pregunta No Se Encuentra Registrada' AS "Mensaje";
        END IF;

    ELSE
        SELECT -1 AS "Codigo", 'El Mensaje No Tiene El Formato Correcto' AS "Mensaje";
    END IF;

END

CREATE PROCEDURE `sp_EnviarMensajeChat`(
    IN _Mensaje TEXT,
    IN _FechaEnvio VARCHAR(100),
    IN _NombreArchivo VARCHAR(100),
    IN _Archivo LONGBLOB,
    IN _Extension VARCHAR(32),
    IN _IdUsuarioEmisor INT,
    IN _IdChat INT
)
BEGIN

    IF courseroom.fn_CampoTextoValido(_Mensaje) = 1 THEN
        
        IF EXISTS(SELECT IdChat FROM tb_chatspersonales WHERE IdChat = _IdChat AND Activo = 1) THEN

            IF courseroom.fn_ExisteUsuario(_IdUsuarioEmisor) = 1 THEN

                INSERT INTO tb_mensajeschat (Mensaje, FechaEnvio, NombreArchivo, Archivo, Extension, IdChat, IdUsuarioEmisor)
                VALUES (_Mensaje, _FechaEnvio, _NombreArchivo, _Archivo, _Extension, _IdChat, _IdUsuarioEmisor);

                SELECT LAST_INSERT_ID() AS "Codigo", 'OK' AS "Mensaje";

            ELSE
                SELECT -1 AS "Codigo", 'El Usuario Emisor No Se Encuentra Registrado' AS "Mensaje";
            END IF;

        ELSE
            SELECT -1 AS "Codigo", 'El Chat No Se Encuentra Registrado' AS "Mensaje";
        END IF;

    ELSE
        SELECT -1 AS "Codigo", 'El Mensaje No Tiene El Formato Correcto' AS "Mensaje";
    END IF;

END
CREATE PROCEDURE `sp_AgregarPregunta`(
    IN _IdUsuario INT,
    IN _Pregunta VARCHAR(200),
    IN _Descripcion TEXT,
    IN _FechaCreacion VARCHAR(100)
)
BEGIN
    IF courseroom.fn_CampoValido(_FechaCreacion) = 1 AND courseroom.fn_CampoValido(_Descripcion) = 1
    AND courseroom.fn_CampoValido(_Pregunta) = 1 THEN

        IF courseroom.fn_ExisteUsuario(_IdUsuario) = 1 THEN
        
            INSERT INTO tb_preguntas (Pregunta, Descripcion, FechaCreacion, Estatus ,IdUsuario, Activo)
            VALUES (_Pregunta, _Descripcion, _FechaCreacion, 'Abierta', _IdUsuario, 1);

            SELECT LAST_INSERT_ID() AS "Codigo", 'OK' AS "Mensaje";

        ELSE
            SELECT -1 AS "Codigo", 'El Usuario No Se Encuentra Registrado' AS "Mensaje";
        END IF;
    ELSE 
        SELECT -1 AS "Codigo", 'Algun Campo No Tiene El Formato Valido' AS "Mensaje";
    END IF;
        
END

CREATE PROCEDURE `sp_RemoverPregunta`(
    IN _IdUsuario INT,
    IN _IdPregunta INT
)
BEGIN

    IF courseroom.fn_ExisteUsuario(_IdUsuario) = 1 THEN
        IF EXISTS(SELECT IdPregunta FROM tb_preguntas WHERE IdPregunta = _IdPregunta AND Activo = 1 AND IdUsuario = _IdUsuario) THEN
            UPDATE tb_preguntas SET Activo = 0 WHERE IdPregunta = _IdPregunta;
            SELECT 1 AS "Codigo", 'OK' AS "Mensaje";
        ELSE
            SELECT -1 AS "Codigo", 'La Pregunta No Se Encuentra Registrada' AS "Mensaje";
        END IF;
            
    ELSE
        SELECT -1 AS "Codigo", 'El Usuario No Se Encuentra Registrado' AS "Mensaje";
    END IF;
END

CREATE PROCEDURE `sp_MarcarPreguntaSolucionada`(
    IN _IdUsuario INT,
    IN _IdPregunta INT
)
BEGIN

    IF courseroom.fn_ExisteUsuario(_IdUsuario) = 1 THEN
        IF EXISTS(SELECT IdPregunta FROM tb_preguntas WHERE IdPregunta = _IdPregunta AND Activo = 1 AND IdUsuario = _IdUsuario) THEN
            UPDATE tb_preguntas SET Estatus = 'Solucionada' WHERE IdPregunta = _IdPregunta;
            SELECT 1 AS "Codigo", 'OK' AS "Mensaje";
        ELSE
            SELECT -1 AS "Codigo", 'La Pregunta No Se Encuentra Registrada' AS "Mensaje";
        END IF;
            
    ELSE
        SELECT -1 AS "Codigo", 'El Usuario No Se Encuentra Registrado' AS "Mensaje";
    END IF;
END

CREATE PROCEDURE `sp_BuscarChatsPersonales`(
	IN _Busqueda VARCHAR(250),
    IN _IdUsuario INT
)
BEGIN

    IF courseroom.fn_CampoValido(_Busqueda) = 1 THEN

        IF courseroom.fn_ExisteUsuario(_IdUsuario) = 1 THEN

            SELECT Chats.IdChat, Usuarios.Imagen, courseroom.fn_NombreCompleto(Usuarios.Nombre, Usuarios.Paterno, Usuarios.Materno) AS NombreCompleto,
            Chats.FechaCreacion, courseroom.fn_UltimoMensajeChat(Chats.IdChat) AS UltimoMensaje
            FROM tb_chatspersonales Chats
            INNER JOIN tb_usuarios Usuarios ON Chats.IdUsuarioEmisor = Usuarios.IdUsuario
            WHERE Chats.IdUsuarioEmisor = _IdUsuario OR Chats.IdUsuarioReceptor = _IdUsuario 
            AND (
                Usuarios.Nombre LIKE CONCAT('%',_Busqueda,'%') OR
                Usuarios.Paterno LIKE CONCAT('%',_Busqueda,'%') OR
                Usuarios.Materno LIKE CONCAT('%',_Busqueda,'%')
            )
            AND Chats.Activo = 1 ORDER BY Chats.IdChat DESC LIMIT 100;

        ELSE
            SELECT -1 AS "Codigo", 'El Usuario No Se Encuentra Registrado' AS "Mensaje";
        END IF;
    ELSE
        SELECT -1 AS "Codigo", 'El Valor De La Busqueda No Tiene El formato Adecuado' AS "Mensaje";
    END IF;
END

CREATE PROCEDURE `sp_ObtenerDatosChatPersonal`(
    IN _IdChat INT,
    IN _IdUsuario INT
)
BEGIN

    IF EXISTS(SELECT IdChat FROM tb_chatspersonales WHERE IdChat = _IdChat And Activo = 1 AND IdUsuarioEmisor = _IdUsuario) THEN

        SELECT Chats.IdUsuarioEmisor, courseroom.fn_NombreCompleto(Usuarios.Nombre, Usuarios.Paterno, Usuarios.Materno) AS NombreCompleto
        FROM tb_chatspersonales Chats
        INNER JOIN tb_usuarios Usuarios ON Chats.IdUsuarioEmisor = Usuarios.IdUsuario
        WHERE Chats.IdChat = _IdChat AND Chats.Activo = 1;
    ELSE
        SELECT Chats.IdUsuarioReceptor, courseroom.fn_NombreCompleto(Usuarios.Nombre, Usuarios.Paterno, Usuarios.Materno) AS NombreCompleto
        FROM tb_chatspersonales Chats
        INNER JOIN tb_usuarios Usuarios ON Chats.IdUsuarioReceptor = Usuarios.IdUsuario
        WHERE Chats.IdChat = _IdChat AND Chats.Activo = 1;
    END IF;
END

CREATE PROCEDURE `sp_RemoverChat`(
    IN _IdUsuario INT,
    IN _IdChat INT
)
BEGIN

    IF courseroom.fn_ExisteUsuario(_IdUsuario) = 1 THEN
        IF EXISTS(SELECT IdChat FROM tb_chatspersonales WHERE IdChat = _IdChat AND Activo = 1
        AND (IdUsuarioEmisor = _IdUsuario OR IdUsuarioReceptor = _IdUsuario)) THEN
            UPDATE tb_chatspersonales SET Activo = 0 WHERE IdChat = _IdChat;
            SELECT 1 AS "Codigo", 'OK' AS "Mensaje";
        ELSE
            SELECT -1 AS "Codigo", 'La Pregunta No Se Encuentra Registrada' AS "Mensaje";
        END IF;
            
    ELSE
        SELECT -1 AS "Codigo", 'El Usuario No Se Encuentra Registrado' AS "Mensaje";
    END IF;
END

CREATE PROCEDURE `sp_ObtenerUsuarioChatear`(
    INT _Busqueda VARCHAR(250)
)
BEGIN
    SELECT IdUsuario, courseroom.fn_NombreCompleto(Nombre, Paterno, Materno) AS NombreCompleto
    FROM tb_usuarios WHERE Activo = 1 
    AND CONCAT(Nombre, ' ', Paterno, ' ',Materno) LIKE CONCAT('%',_Busqueda,'%') LIMIT 10;
END

CREATE PROCEDURE `sp_ObtenerTareasMes`(
    IN _IdUsuario INT,
    IN _Mes INT
)
BEGIN
    
    SELECT courseroom.fn_ObtenerDia(Tareas.FechaEntrega) AS "Dia", 
    courseroom.fn_ObtenerHorario(Tareas.FechaEntrega) AS "Horario", Tareas.Descripcion
    FROM tb_tareas Tareas
    INNER JOIN tb_tareascursousuarios TareasUsuarios ON Tareas.IdTarea = TareasUsuarios.IdTarea
    WHERE TareasUsuarios.IdUsuario = _IdUsuario AND Tareas.Activo = 1 
    AND courseroom.fn_ObtenerMes(Tareas.FechaEntrega) = _Mes;
    
END