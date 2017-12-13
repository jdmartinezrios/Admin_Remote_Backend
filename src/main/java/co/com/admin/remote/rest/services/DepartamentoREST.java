package co.com.admin.remote.rest.services;

import co.com.admin.remote.jpa.entities.Departamento;
import co.com.admin.remote.jpa.sessions.DepartamentoFacade;
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
@Path("departamentos")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class DepartamentoREST {
    
    @EJB
    private DepartamentoFacade departamentoEJB;
    
    /**
     * Buscar todas las departamentos
     * @return 
     */
    @GET
    public List<Departamento> findAll(){
        return departamentoEJB.findAll();        
    }
    
    /**
     * Buscar departamentos por id
     * 
     * @param id
     * @return 
     */
    @GET 
    @Path("{id}")
    public Departamento findById(@PathParam("id") Integer id){        
        return departamentoEJB.find(id);
    }
    
    /**
     * Crear departamento
     * 
     * @param departamento
     */
    @POST
    public void create(Departamento departamento){
        departamentoEJB.create(departamento);
    }
    
    /**
     * Edita la departamento por id
     * 
     * @param id
     * @param departamento
     */
    @PUT
    @Path("{id}")
    public void edit(@PathParam("id") Integer id, Departamento departamento){
        departamentoEJB.edit(departamento);
    }
}
