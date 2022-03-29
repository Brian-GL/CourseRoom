-- Eliminar usuarios:
USE courseroom;
DELETE FROM tb_usuarios WHERE IdUsuario > 1;
-- ALTER TABLE tb_usuarios AUTO_INCREMENT = 1;

SELECT *FROM tb_usuarios;