CREATE PROCEDURE `sp_Agregar_Usuario` (
	IN _Correo_Electronico VARCHAR(150),
    IN _Contrasena VARCHAR(256),
    IN _Nombre VARCHAR(50),
    IN _Paterno VARCHAR(30),
    IN _Materno VARCHAR(30),
    IN _Id_Perfil INT,
    IN _Id_Localidad INT
)
BEGIN
	
    DECLARE _Tipo_Perfil VARCHAR(12);
    DECLARE _Localidad VARCHAR(150);
    
    -- Espacio para validaciones:
    IF _Correo_Electronico IS NOT NULL AND length(_Correo_Electronico) > 1 
    AND _Nombre IS NOT NULL AND length(_Nombre) > 1
    AND _Contrasena IS NOT NULL AND length(_Contrasena) > 1 THEN
		SELECT 0 AS "Codigo", 'El Correo Electronico Tiene Valor Nulo O Esta Vacio';
    ELSE
		IF NOT EXISTS(SELECT CorreoElectronico FROM Tb_Usuarios 
        WHERE CorreoElectronico = _Correo_Electronico AND Activo = 1) THEN
			
            SET _Tipo_Perfil = (SELECT Perfil FROM Tb_CatPerfiles WHERE IdPerfil = _Id_Perfil);
            SET _Localidad = (SELECT Localidad FROM Tb_CatLocalidades WHERE Localidad = _Id_Localidad);
            
            -- Fecha:
            IF _Tipo_Perfil IS NOT NULL AND _Localidad IS NOT NULL THEN
				/*
                INSERT INTO tb_usuario(correo......) VALUES(_Correo_Electronico,_Contrasena, _Nombre,....
					UPPER(DATE_FORMAT(NOW(), '%y/%m/%d %T')),
                )
                */
                
                SELECT 1 AS "Codigo", 'OK' AS "Mensaje";
            
            ELSE
				SELECT 0 AS "Codigo", 'No se pudo obtener la informacion de perfil';
            END IF;
		
        ELSE
			SELECT 0 AS "Codigo", 'El Correo Electronico Ya Se Encuentra Registrado';
        END IF;
        
    END IF;
END