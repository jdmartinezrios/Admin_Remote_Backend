package co.com.admin.remote.rest.services;

import co.com.admin.remote.jpa.entities.Tienda;
import co.com.admin.remote.jpa.sessions.TiendaFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Juan David Martinez
 */
@Path("tiendas")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TiendaREST {
    
    @EJB
    private TiendaFacade tiendaEJB;
    
    /**
     * Buscar todas las Tiendas
     * @return 
     */
    @GET
    public List<Tienda> findAll(){
        return tiendaEJB.findAll();        
    }
    
    /**
     * Buscar Tienda por id
     * 
     * @param id
     * @return 
     */
    @GET 
    @Path("{id}")
    public Tienda findById(@PathParam("id") Integer id){        
        return tiendaEJB.find(id);
    }
    
    /**
     * Crear tienda
     * 
     * @param tienda
     */
    @POST
    public void create(Tienda tienda){
        tiendaEJB.create(tienda);
    }
    
    /**
     * Edita la tienda por id
     * 
     * @param id
     * @param tienda
     */
    @PUT
    @Path("{id}")
    public void edit(@PathParam("id") Integer id, Tienda tienda){
        tiendaEJB.edit(tienda);
    }
}

