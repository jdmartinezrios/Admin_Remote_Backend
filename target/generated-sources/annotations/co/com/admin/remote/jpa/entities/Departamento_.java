package co.com.admin.remote.jpa.entities;

import co.com.admin.remote.jpa.entities.Ciudad;
import co.com.admin.remote.jpa.entities.Pais;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-04T02:23:29")
@StaticMetamodel(Departamento.class)
public class Departamento_ { 

    public static volatile ListAttribute<Departamento, Ciudad> ciudadList;
    public static volatile SingularAttribute<Departamento, Integer> id;
    public static volatile SingularAttribute<Departamento, String> nombre;
    public static volatile SingularAttribute<Departamento, Pais> pais;

}