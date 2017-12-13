package co.com.admin.remote.jpa.entities;

import co.com.admin.remote.jpa.entities.Ciudad;
import co.com.admin.remote.jpa.entities.Documento;
import co.com.admin.remote.jpa.entities.Pedido;
import co.com.admin.remote.jpa.entities.Rol;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-03T22:53:45")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-04T02:23:29")
>>>>>>> 10d81fb9412cc80c521ea846b07523c9a961b98f
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> apellidos;
    public static volatile SingularAttribute<Cliente, String> numDocumento;
    public static volatile SingularAttribute<Cliente, String> tipo;
    public static volatile SingularAttribute<Cliente, String> direccion;
    public static volatile ListAttribute<Cliente, Pedido> pedidoList;
    public static volatile SingularAttribute<Cliente, Documento> documento;
    public static volatile SingularAttribute<Cliente, String> nombres;
    public static volatile SingularAttribute<Cliente, String> password;
    public static volatile ListAttribute<Cliente, Rol> rolesList;
    public static volatile SingularAttribute<Cliente, Ciudad> ciudad;
    public static volatile SingularAttribute<Cliente, String> telefono2;
    public static volatile SingularAttribute<Cliente, Integer> id;
    public static volatile SingularAttribute<Cliente, String> telefono;
    public static volatile SingularAttribute<Cliente, Boolean> activo;

}