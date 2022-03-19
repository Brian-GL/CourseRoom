
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