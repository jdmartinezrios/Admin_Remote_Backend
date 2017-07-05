package co.com.admin.remote.rest.services;

import co.com.admin.remote.jpa.entities.Documento;
import co.com.admin.remote.jpa.sessions.DocumentoFacade;
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
@Path("documentos")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class DocumentoREST {
    
    @EJB
    private DocumentoFacade documentoEJB;
    
    /**
     * Buscar todas los documento
     * @return 
     */
    @GET
    public List<Documento> findAll(){
        return documentoEJB.findAll();        
    }
    
    /**
     * Buscar documentos por id
     * 
     * @param id
     * @return 
     */
    @GET 
    @Path("{id}")
    public Documento findById(@PathParam("id") Integer id){        
        return documentoEJB.find(id);
    }
    
    /**
     * Crear departamento
     * 
     * @param documento
     */
    @POST
    public void create(Documento documento){
        documentoEJB.create(documento);
    }
    
    /**
     * Edita la departamento por id
     * 
     * @param id
     * @param documento
     */
    @PUT
    @Path("{id}")
    public void edit(@PathParam("id") Integer id, Documento documento){
        documentoEJB.edit(documento);
    }
}

