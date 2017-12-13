package co.com.admin.remote.rest.services;

import co.com.admin.remote.jpa.entities.Ciudad;
import co.com.admin.remote.jpa.sessions.CiudadFacade;
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
@Path("ciudades")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CiudadREST {
    
    @EJB
    private CiudadFacade ciudadEJB;
    
    /**
     * Buscar todas las ciudades 
     * @return 
     */
    @GET
    public List<Ciudad> findAll(){
        return ciudadEJB.findAll();        
    }
    
    /**
     * Buscar ciudades por id
     * 
     * @param id
     * @return 
     */
    @GET 
    @Path("{id}")
    public Ciudad findById(@PathParam("id") Integer id){        
        return ciudadEJB.find(id);
    }
    
    /**
     * Crear ciudad 
     * 
     * @param ciudad 
     */
    @POST
    public void Ciudad(Ciudad ciudad){
        ciudadEJB.create(ciudad);
    }
    
    /**
     * Edita la ciudad por id
     * 
     * @param id
     * @param ciudad 
     */
    @PUT
    @Path("{id}")
    public void edit(@PathParam("id") Integer id, Ciudad ciudad){
        ciudadEJB.edit(ciudad);
    }
        
}
