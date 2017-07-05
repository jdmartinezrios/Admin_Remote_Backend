package co.com.admin.remote.rest.services;

import co.com.admin.remote.jpa.entities.Pais;
import co.com.admin.remote.jpa.sessions.PaisFacade;
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
@Path("paises")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PaisREST {
    
    @EJB
    private PaisFacade paisEJB;
    
    /**
     * Buscar todas los Paises
     * @return 
     */
    @GET
    public List<Pais> findAll(){
        return paisEJB.findAll();        
    }
    
    /**
     * Buscar Paises por id
     * 
     * @param id
     * @return 
     */
    @GET 
    @Path("{id}")
    public Pais findById(@PathParam("id") Integer id){        
        return paisEJB.find(id);
    }
    
    /**
     * Crear Paises
     * 
     * @param pais
     */
    @POST
    public void create(Pais pais){
        paisEJB.create(pais);
    }
    
    /**
     * Edita la Paises por id
     * 
     * @param id
     * @param pais
     */
    @PUT
    @Path("{id}")
    public void edit(@PathParam("id") Integer id, Pais pais){
        paisEJB.edit(pais);
    }
}

