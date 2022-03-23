CREATE PROCEDURE `sp_EnviarMensajePregunta`(
    IN _IdUsuario INT,
)
CREATE PROCEDURE `sp_EnviarMensajeChat`(
    IN _IdUsuario INT,
)


CREATE PROCEDURE `sp_ObtenerCredenciales` (
    IN _CorreoElectronico VARCHAR(150)
)
BEGIN
    SELECT Contrasenia FROM tb_usuarios WHERE _CorreoElectronico = CorreoElectronico AND Activo = 1
END

CREATE PROCEDURE `sp_AgregarSesion` (
    IN _IdUsuario INT,
    IN _Dispositivo VARCHAR(50),
    IN _Fabricante VARCHAR(30),
    IN _Uuid VARCHAR(64),
    IN _UltimaConexion VARCHAR(100),
    IN _DireccionIP VARCHAR(100)
)
BEGIN
    IF courseroom.fn_ExisteUsuario(_IdUsuario) = 1 THEN
        IF courseroom.fn_CampoValido(_Dispositivo) = 1 AND 
        courseroom.fn_CampoValido(_Fabricante) = 1 AND
        courseroom.fn_CampoValido(_Uuid) = 1 AND
        courseroom.fn_CampoValido(_UltimaConexion) = 1 AND
        courseroom.fn_CampoValido(_DireccionIP) = 1 THEN
        
        INSERT INTO tb_sesiones (Uuid, Dispositivo, Fabricante, UltimaConexion, DireccionIP, IdUsuario, Activo)
        VALUES (_Uuid, _Dispositivo, _Fabricante, _UltimaConexion, _DireccionIP, _IdUsuario, 1);

        SELECT LAST_INSERT_ID() AS "Codigo", 'OK' AS "Mensaje";

        ELSE 
            SELECT -1 AS "Codigo", 'Algun Campo Es Invalido' AS "Mensaje";
        END IF;
    ELSE
        SELECT -1 AS "Codigo", 'El Correo Electronico Ya Se Encuentra Registrado' AS "Mensaje";
    END IF;
END

CREATE PROCEDURE `sp_ObtenerConfiguraciones`(
    IN _IdUsuario INT
)
BEGIN
    SELECT ChatsConmigo, AvisosActivos FROM tb_usuarios WHERE IdUsuario = _IdUsuario AND Activo = 1;
END

CREATE PROCEDURE `sp_ObtenerMensajesCursos`(
    IN _IdCurso INT
)
BEGIN
    SELECT MensajesCurso.IdMensaje, MensajesCurso.Mensaje, MensajesCurso.FechaEnvio,
    courseroom.fn_NombreCompleto(Usuarios.Nombre, Usuarios.Paterno, Usuarios.Materno) AS NombreCompleto,
    MensajesCurso.NombreArchivo, MensajesCurso.Archivo, MensajesCurso.Extension 
    FROM tb_mensajescurso MensajesCurso 
    INNER JOIN tb_usuarios Usuarios ON Usuarios.IdUsuario = MensajesCurso.IdUsuarioEmisor
    WHERE MensajesCurso.IdCurso= _IdCurso ORDER BY MensajesCurso.IdMensaje DESC LIMIT 250;
END

CREATE PROCEDURE `sp_ObtenerMensajesPregunta`(
    IN _IdPregunta INT
)
BEGIN
    SELECT MensajesPreguntas.IdMensaje, MensajesPreguntas.Mensaje, MensajesPreguntas.FechaEnvio,
    courseroom.fn_NombreCompleto(Usuarios.Nombre, Usuarios.Paterno, Usuarios.Materno) AS NombreCompleto,
    MensajesPreguntas.NombreArchivo, MensajesPreguntas.Archivo, MensajesPreguntas.Extension 
    FROM tb_mensajespreguntas MensajesPreguntas 
    INNER JOIN tb_usuarios Usuarios ON Usuarios.IdUsuario = MensajesPreguntas.IdUsuarioEmisor
    WHERE MensajesPreguntas.IdPregunta = _IdPregunta ORDER BY MensajesPreguntas.IdMensaje DESC LIMIT 250;
END


CREATE PROCEDURE `sp_ObtenerPerfilUsuarioChat`(
    IN _IdUsuario INT
)
BEGIN

   SELECT Imagen, Nombre, Paterno, Materno, CorreoElectronico, 
   Genero, TipoUsuario FROM tb_usuarios 
   WHERE IdUsuario = _IdUsuario AND Activo = 1;
   
END

CREATE PROCEDURE `sp_ObtenerMensajesChat`(
    IN _IdChat INT
)
BEGIN
    SELECT MensajesChat.IdMensaje, MensajesChat.Mensaje, MensajesChat.FechaEnvio,
    courseroom.fn_NombreCompleto(Usuarios.Nombre, Usuarios.Paterno, Usuarios.Materno) AS NombreCompleto,
    MensajesChat.NombreArchivo, MensajesChat.Archivo, MensajesChat.Extension 
    FROM tb_mensajeschat MensajesChat 
    INNER JOIN tb_usuarios Usuarios ON Usuarios.IdUsuario = MensajesChat.IdUsuarioEmisor
    WHERE MensajesChat.IdChat = _IdChat ORDER BY MensajesChat.IdChat DESC LIMIT 250;
END

CREATE PROCEDURE `sp_ObtenerMensajeTareas`(
    IN _IdTarea INT,
)
BEGIN
    SELECT MensajesTareas.IdMensaje, MensajesTareas.Mensaje, MensajesTareas.FechaEnvio,
    courseroom.fn_NombreCompleto(Usuarios.Nombre, Usuarios.Paterno, Usuarios.Materno) AS NombreCompleto,
    MensajesTareas.NombreArchivo, MensajesTareas.Archivo, MensajesTareas.Extension 
    FROM tb_mensajestareas MensajesTareas
    INNER JOIN tb_usuarios Usuarios ON Usuarios.IdUsuario = MensajesTareas.IdUsuarioEmisor
    WHERE MensajesTareas.IdTarea = _IdTarea ORDER BY MensajesTareas.IdMensaje DESC LIMIT 250;
END

CREATE PROCEDURE `sp_ObtenerMensajesGrupos`(
    IN _IdGrupo INT
)
BEGIN
    SELECT MensajesGrupos.IdMensaje, MensajesGrupos.Mensaje, MensajesGrupos.FechaEnvio,
    courseroom.fn_NombreCompleto(Usuarios.Nombre, Usuarios.Paterno, Usuarios.Materno) AS NombreCompleto,
    MensajesGrupos.NombreArchivo, MensajesGrupos.Archivo, MensajesGrupos.Extension 
    FROM tb_mensajesgrupos MensajesGrupos 
    INNER JOIN tb_usuarios Usuarios ON Usuarios.IdUsuario = MensajesGrupos.IdUsuarioEmisor
    WHERE MensajesGrupos.IdGrupo = _IdGrupo ORDER BY MensajesGrupos.IdMensaje DESC LIMIT 250;
END

CREATE PROCEDURE `sp_ObtenerRetroalimentaciones`(
    IN _IdTarea INT
)
BEGIN
    SELECT IdMensaje, Mensaje, FechaEnvio, NombreArchivo, Archivo, Extension FROM tb_retroalimentaciones
    WHERE IdTarea = _IdTarea ORDER BY IdMensaje DESC LIMIT 250;
END

CREATE PROCEDURE `sp_ObtenerDesempeno`(
    IN _IdUsuario INT
)
BEGIN
    SELECT DesempenoCurso.IdDesempeno, DesempenoCurso.Prediccion,
    COUNT(Tareas.IdTarea) AS NumeroTareasCalificadas, DesempenoCurso.RumboEstatus, Cursos.IdCurso,
    Cursos.Imagen, Cursos.Nombre, Usuarios.PromedioGeneral
    FROM tb_desempenousuariocurso DesempenoCurso
    INNER JOIN tb_usuarios Usuarios ON DesempenoCurso.IdUsuario = Usuarios.IdUsuario
    INNER JOIN tb_tareascursousuarios TareasUsuarios ON TareasUsuarios.IdUsuario = Usuarios.IdUsuario 
    AND TareasUsuarios.Estatus = 'CALIFICADA'
    INNER JOIN tb_tareas Tareas ON Tareas.IdTarea = TareasUsuarios.IdTarea
    AND Tareas.IdCurso = DesempenoCurso.IdCurso
    INNER JOIN tb_cursos Cursos ON Cursos.IdCurso = DesempenoCurso.IdCurso
    WHERE DesempenoCurso.IdUsuario = _IdUsuario;
END

CREATE PROCEDURE `sp_ObtenerPregunta`(
    IN _IdPregunta INT
)
BEGIN
    SELECT Usuarios.Imagen, courseroom.fn_NombreCompleto(Usuarios.Nombre, Usuarios.Paterno, Usuarios.Materno) AS NombreCompleto,
    Preguntas.Pregunta, Preguntas.Descripcion, Preguntas.FechaCreacion, Preguntas.Estatus FROM tb_preguntas Preguntas
    INNER JOIN tb_usuarios Usuarios ON Usuarios.IdUsuario = Preguntas.IdUsuario
    WHERE Preguntas.IdPregunta = _IdPregunta AND Preguntas.Activo = 1;
END

CREATE PROCEDURE `sp_ObtenerGrupo`(
    IN _IdGrupo INT
)
BEGIN
    SELECT Grupos.Imagen, Grupos.Nombre, Grupos.Descripcion, Grupos.FechaCreacion, Cursos.IdCurso,
    Cursos.Nombre FROM tb_grupos Grupos
    INNER JOIN tb_cursos Cursos ON Cursos.IdCurso = Grupos.IdCurso
    WHERE Grupos.IdGrupo = _IdGrupo AND Grupos.Activo = 1;
END

CREATE PROCEDURE `sp_ObtenerTarea`(
    IN _IdTarea INT,
    IN _IdUsuario INT
BEGIN
    SELECT Tareas.Nombre, Tareas.Descripcion, Tareas.FechaCreacion, Tareas.FechaEntrega, Tareas.TareaGrupal
    FROM tb_taras Tareas
    INNER JOIN tb_tareascursousuarios TareasCursoUsuario ON TareasCursoUsuario.IdTarea = Tareas.IdTarea
    WHERE TareasCursoUsuario.IdTarea = _IdTarea AND TareasCursoUsuario.IdUsuario = _IdUsuario AND Tareas.Activo = 1;

END

CREATE PROCEDURE `sp_ObtenerCurso`(
    IN _IdCurso INT
)
BEGIN
    SELECT Cursos.Imagen, Cursos.Nombre, Cursos.Descripcion, Usuarios.Imagen,
    courseroom.fn_NombreCompleto(Usuarios.Nombre, Usuarios.Paterno, Usuarios.Materno) AS NombreCompleto
    Usuarios.Descripcion, Cursos.FechaCreacion FROM tb_cursos Cursos
    INNER JOIN tb_usuarios Usuarios ON Usuarios.IdUsuario = Cursos.IdProfesor
    WHERE Cursos.IdCurso = _IdCurso AND Cursos.Activo = 1;
END

CREATE PROCEDURE `sp_ObtenerMaterialesSubidosCurso`(
    IN _IdCurso INT
)
BEGIN
    SELECT MaterialesSubidos.NombreArchivo, MaterialesSubidos.Archivo,
    MaterialesSubidos.Extension, MaterialesSubidos.FechaEnviado FROM tb_materialessubidoscurso MaterialesSubidos
    INNER JOIN tb_usuarios Usuarios ON Usuarios.IdUsuario = Grupos.IdCurso
    WHERE Grupos.IdGrupo = _IdGrupo AND Grupos.Activo = 1;
END

CREATE PROCEDURE `sp_ObtenerArchivosCompartidosGrupo`(
    IN _IdGrupo INT
)
BEGIN
    SELECT CompartidosGrupos.IdArchivoCompartido, CompartidosGrupos.NombreArchivo, CompartidosGrupos.Archivo,
    CompartidosGrupos.Extension, CompartidosGrupos.FechaEnviado,
    courseroom.fn_NombreCompleto(Usuarios.Nombre, Usuarios.Paterno, Usuarios.Materno) AS NombreCompleto
    FROM tb_archivoscompartidosgrupos CompartidosGrupos
    INNER JOIN tb_usuarios Usuarios ON Usuarios.IdUsuario = CompartidosGrupos.IdUsuario
    INNER JOIN tb_grupos Grupos ON Grupos.IdGrupo = CompartidosGrupos.IdGrupo
    WHERE CompartidosGrupos.IdGrupo = _IdGrupo AND CompartidosGrupos.Activo = 1;
END

CREATE PROCEDURE `sp_ObtenerArchivosAdjuntosTarea`(
    IN _IdTarea INT
)
BEGIN
    SELECT AdjuntosTareas.IdArchivoAdjunto, AdjuntosTareas.NombreArchivo, AdjuntosTareas.Archivo,
    AdjuntosTareas.Extension, AdjuntosTareas.FechaEnviado
    FROM tb_archivosadjuntostareas AdjuntosTareas
    INNER JOIN tb_tareas Tareas ON Tareas.IdTarea = AdjuntosTareas.IdTarea
    WHERE AdjuntosTareas.IdTarea = _IdTarea AND AdjuntosTareas.Activo = 1;
END

CREATE PROCEDURE `sp_ArchivosSubidosTarea`(
    IN _IdTarea INT
    IN _IdUsuario INT
)
BEGIN
    SELECT SubidosTareas.IdArchivoSubido, SubidosTareas.NombreArchivo, SubidosTareas.Archivo,
    SubidosTareas.Extension, SubidosTareas.FechaEnviado FROM tb_archivossubidostareas SubidosTareas
    WHERE SubidosTareas.IdTarea = _IdTarea AND SubidosTareas.IdUsuario = _IdUsuario AND SubidosTareas.Activo = 1 
    ORDER BY SubidosTareas.IdArchivoSubido DESC LIMIT 250;
END