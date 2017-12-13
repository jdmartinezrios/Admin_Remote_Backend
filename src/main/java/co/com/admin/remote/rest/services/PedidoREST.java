package co.com.admin.remote.rest.services;

import co.com.admin.remote.jpa.entities.Pedido;
import co.com.admin.remote.jpa.sessions.PedidoFacade;
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
@Path("pedidos")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PedidoREST {
    
    @EJB
    private PedidoFacade pedidoEJB;
    
    /**
     * Buscar todas los pedidos
     * @return 
     */
    @GET
    public List<Pedido> findAll(){
        return pedidoEJB.findAll();        
    }
    
    /**
     * Buscar pedido por id
     * 
     * @param id
     * @return 
     */
    @GET 
    @Path("{id}")
    public Pedido findById(@PathParam("id") Integer id){        
        return pedidoEJB.find(id);
    }
    
    /**
     * Crear pedido
     * 
     * @param pedido
     */
    @POST
    public void create(Pedido pedido){
        pedidoEJB.create(pedido);
    }
    
    /**
     * Edita la pedido por id
     * 
     * @param id
     * @param pedido
     */
    @PUT
    @Path("{id}")
    public void edit(@PathParam("id") Integer id, Pedido pedido){
        pedidoEJB.edit(pedido);
    }
}
