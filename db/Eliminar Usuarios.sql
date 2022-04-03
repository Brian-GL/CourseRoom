-- Eliminar usuarios:
USE courseroom;
DELETE FROM tb_sesiones WHERE IdSesion > 0;
ALTER TABLE tb_sesiones AUTO_INCREMENT = 1;
DELETE FROM tb_usuarios WHERE IdUsuario > 0;
ALTER TABLE tb_usuarios AUTO_INCREMENT = 1;
ALTER TABLE tb_tematicas AUTO_INCREMENT = 1;

DELETE FROM tb_tematicas WHERE IdTematica > 0;

USE courseroom;
SELECT *FROM tb_usuarios;
SELECT *FROM tb_localidades WHERE IdLocalidad = 576;
SELECT *FROM tb_sesiones ORDER BY IdSesion DESC;