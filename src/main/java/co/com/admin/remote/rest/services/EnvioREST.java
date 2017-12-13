package co.com.admin.remote.rest.services;

import co.com.admin.remote.jpa.entities.Envio;
import co.com.admin.remote.jpa.sessions.EnvioFacade;
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
@Path("envios")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EnvioREST {
    
    @EJB
    private EnvioFacade envioEJB;
    
    /**
     * Buscar todas lOs envios
     * @return 
     */
    @GET
    public List<Envio> findAll(){
        return envioEJB.findAll();        
    }
    
    /**
     * Buscar envios por id
     * 
     * @param id
     * @return 
     */
    @GET 
    @Path("{id}")
    public Envio findById(@PathParam("id") Integer id){        
        return envioEJB.find(id);
    }
    
    /**
     * Crear envios
     * 
     * @param envio
     */
    @POST
    public void create(Envio envio){
        envioEJB.create(envio);
    }
    
    /**
     * Edita la envios por id
     * 
     * @param id
     * @param envio
     */
    @PUT
    @Path("{id}")
    public void edit(@PathParam("id") Integer id, Envio envio){
        envioEJB.edit(envio);
    }
}

