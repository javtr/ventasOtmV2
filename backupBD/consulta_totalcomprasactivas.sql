SELECT sum(c.precio_compra) FROM compra c inner join cliente cl inner join factura f where c.cliente_id= cl.id and c.factura_id=f.id and cl.estado = 0 and f.compra_activa = 0;