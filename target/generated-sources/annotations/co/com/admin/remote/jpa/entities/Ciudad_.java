package co.com.admin.remote.jpa.entities;

import co.com.admin.remote.jpa.entities.Cliente;
import co.com.admin.remote.jpa.entities.Departamento;
import co.com.admin.remote.jpa.entities.Tienda;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-04T02:23:29")
@StaticMetamodel(Ciudad.class)
public class Ciudad_ { 

    public static volatile ListAttribute<Ciudad, Cliente> clienteList;
    public static volatile SingularAttribute<Ciudad, String> codigo;
    public static volatile ListAttribute<Ciudad, Tienda> tiendaList;
    public static volatile SingularAttribute<Ciudad, Departamento> departamento;
    public static volatile SingularAttribute<Ciudad, Integer> id;
    public static volatile SingularAttribute<Ciudad, String> nombre;

}