-- Eliminar usuarios:
USE courseroom;
DELETE FROM tb_sesiones WHERE IdSesion > 0;
ALTER TABLE tb_sesiones AUTO_INCREMENT = 1;
DELETE FROM tb_usuarios WHERE IdUsuario > 0;
ALTER TABLE tb_tematicas AUTO_INCREMENT = 1;
ALTER TABLE tb_preguntas AUTO_INCREMENT = 1;
ALTER TABLE tb_usuarios AUTO_INCREMENT = 1;
DELETE FROM tb_tematicasusuarios WHERE IdTematica > 0;
DELETE FROM tb_tematicas WHERE IdTematica > 0;
DELETE FROM tb_preguntas WHERE IdPregunta > 0;

USE courseroom;
SELECT *FROM tb_usuarios;
SELECT *FROM tb_sesiones ORDER BY IdSesion DESC;