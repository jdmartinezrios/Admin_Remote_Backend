package co.com.admin.remote.jpa.entities;

import co.com.admin.remote.jpa.entities.Cliente;
import co.com.admin.remote.jpa.entities.Envio;
import co.com.admin.remote.jpa.entities.Tienda;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-03T22:53:45")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, String> descSolicitante;
    public static volatile SingularAttribute<Pedido, String> codigo;
    public static volatile SingularAttribute<Pedido, Integer> ordenSap;
    public static volatile SingularAttribute<Pedido, String> upc;
    public static volatile SingularAttribute<Pedido, String> ordenCompra;
    public static volatile SingularAttribute<Pedido, Integer> tipoPedido;
    public static volatile SingularAttribute<Pedido, Cliente> cliente;
    public static volatile SingularAttribute<Pedido, Tienda> tienda;
    public static volatile SingularAttribute<Pedido, Integer> id;
    public static volatile SingularAttribute<Pedido, Integer> cantidad;
    public static volatile SingularAttribute<Pedido, String> sku;
    public static volatile ListAttribute<Pedido, Envio> envioList;
    public static volatile SingularAttribute<Pedido, String> tipoPedidoDesc;

}