package co.com.admin.remote.jpa.entities;

import co.com.admin.remote.jpa.entities.Pedido;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-03T22:53:45")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-04T02:23:29")
>>>>>>> 10d81fb9412cc80c521ea846b07523c9a961b98f
@StaticMetamodel(Envio.class)
public class Envio_ { 

    public static volatile SingularAttribute<Envio, String> fechaCarga;
    public static volatile SingularAttribute<Envio, String> establecimiento;
    public static volatile SingularAttribute<Envio, String> estatusNovedad;
    public static volatile SingularAttribute<Envio, Pedido> pedido;
    public static volatile SingularAttribute<Envio, String> fechaEstatusNovedad;
    public static volatile SingularAttribute<Envio, String> observacionesVendedor;
    public static volatile SingularAttribute<Envio, Integer> id;
    public static volatile SingularAttribute<Envio, String> fechaEstimada;
    public static volatile SingularAttribute<Envio, String> comentarios;
    public static volatile SingularAttribute<Envio, String> despachado;

}