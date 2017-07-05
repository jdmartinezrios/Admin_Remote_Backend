package co.com.admin.remote.jpa.entities;

import co.com.admin.remote.jpa.entities.Ciudad;
import co.com.admin.remote.jpa.entities.Pedido;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-04T02:23:29")
@StaticMetamodel(Tienda.class)
public class Tienda_ { 

    public static volatile SingularAttribute<Tienda, String> codigo;
    public static volatile SingularAttribute<Tienda, Ciudad> ciudad;
    public static volatile ListAttribute<Tienda, Pedido> pedidoList;
    public static volatile SingularAttribute<Tienda, Integer> id;
    public static volatile SingularAttribute<Tienda, String> nombre;

}