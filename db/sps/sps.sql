/* CREATE PROCEDURE `sp_ObtenerTablaCursosActuales`(IN IdUsuario INT)
BEGIN


    SELECT IdCurso, NombreCurso, 
    (SELECT Nombre From Tb_Imagenes WHERE IdRegistro = IdCurso And Resolucion = '96x96' AND Id_Tabla = 1) As NombreImagenCurso,
    (SELECT Extension From Tb_Imagenes WHERE IdRegistro = IdCurso And Resolucion = '96x96' AND Id_Tabla = 1) As ExtensionImagenCurso,
    SELECT CONCAT(Nombre,' ',Paterno,' ',Materno) FROM Tb_Usuarios WHERE  IdProfesor = IdUsuario,
    (SELECT Nombre From Tb_Imagenes WHERE IdRegistro = IdProfesor And Resolucion = '96x96' AND Id_Tabla = 0) As NombreImagenProfesor,
    (SELECT Extension From Tb_Imagenes WHERE IdRegistro = IdProfesor And Resolucion = '96x96'  AND Id_Tabla = 0) As ExtensionImagenProfesor,



    SELECT IdTematica, Tematica From Tb_CatTematicas WHERE IdRegistro = IdCurso 

END;

CREATE PROCEDURE `sp_ObtenerCursosRecomendados`()
BEGIN

    SELECT IdCurso, NombreCurso, 
    (SELECT Nombre From Tb_Imagenes WHERE IdRegistro = IdCurso And Resolucion = '96x96' AND Id_Tabla = 5) As NombreImagenCurso,
    (SELECT Extension From Tb_Imagenes WHERE IdRegistro = IdCurso And Resolucion = '96x96' AND Id_Tabla = 5) As ExtensionImagenCurso,
    SELECT CONCAT(Nombre,' ',Paterno,' ',Materno) FROM Tb_Usuarios WHERE  IdProfesor = IdUsuario,
    (SELECT Nombre From Tb_Imagenes WHERE IdRegistro = IdProfesor And Resolucion = '96x96' AND Id_Tabla = 1) As NombreImagenProfesor,
    (SELECT Extension From Tb_Imagenes WHERE IdRegistro = IdProfesor And Resolucion = '96x96'  AND Id_Tabla = 1) As ExtensionImagenProfesor,

END

CREATE PROCEDURE `sp_ObtenerCursosFinalizados`()
BEGIN
   
END */


CREATE PROCEDURE `sp_ObtenerTablaGrupos`(IN IdUsuario INT)

BEGIN

    SELECT Grupos.IdGrupo,Grupos.Nombre, ImagenesGrupo.Nombre As NombreImagenGrupo, 
    ImagenesGrupo.Extension As ExtensionImagenGrupo, Cursos.NombreCurso, ImagenesCurso.Nombre As NombreImagenCurso, 
    ImagenesCurso.Extension As ExtensionImagenCurso, Grupos.FechaCreacion, Grupos.FechaActualizacion
    FROM Tb_Grupos Grupos
    INNER JOIN Tb_Imagenes ImagenesGrupo ON ImagenesGrupo.IdRegistro = Grupos.IdGrupo AND ImagenesGrupo.IdTabla = 3
    INNER JOIN Tb_Imagenes ImagenesCurso ON ImagenesCurso.IdRegistro = Grupos.IdGrupo AND ImagenesCurso.IdTabla = 0
    INNER JOIN Tb_Cursos Cursos ON Curso.IdCurso = Grupos.IdCurso
    INNER JOIN Tb_UsuariosGrupos UsuariosGrupos ON UsuariosGrupos.IdUsuario = IdUsuario AND UsuariosGrupos.IdGrupo = Grupos.IdGrupo
    WHERE Grupos.Activo = 1;

END;

CREATE PROCEDURE `sp_ObtenerTablaPreguntas`()

BEGIN

    SELECT IdPregunta, Preguntador, Pregunta, FechaCreacion, Estatus 
    FROM Tb_Preguntas LIMIT 50 ORDER BY FechaCreacion DESC;

END;