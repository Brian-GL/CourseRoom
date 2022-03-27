-- Eliminar usuarios:
USE courseroom;
DELETE FROM tb_usuarios WHERE IdUsuario > 0;
ALTER TABLE tb_usuarios AUTO_INCREMENT = 1;

SELECT *FROM tb_usuarios;