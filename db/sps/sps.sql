
CREATE PROCEDURE `sp_EntregarArchivosSubidosTarea`(
    IN _IdUsuario INT,
    IN _IdTarea INT,
)
BEGIN
    IF EXISTS(SELECT IdTarea FROM tb_tareascursousuarios WHERE IdTarea = _IdTarea AND IdUsuario = _IdUsuario AND Estatus <> 'ABIERTA' AND Estatus <> 'CERRADA') THEN
        IF Estatus = 'PENDIENTE' THEN
            
    ELSE
        SELECT -1 AS "Codigo", 'No Se Cuenta Con Una Entrega De Esa Tarea De Tal Usuario' AS "Mensaje";
    END;
END