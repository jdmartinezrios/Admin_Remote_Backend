package co.com.admin.remote.rest.services;

import co.com.admin.remote.jpa.entities.Cliente;
import co.com.admin.remote.jpa.sessions.ClienteFacade;
import co.com.admin.remote.rest.auth.DigestUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
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
import javax.ws.rs.core.Response;

/**
 *
 * @author Juan David Martinez
 */
@Path("clientes")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ClienteREST {
    
    @EJB
    private ClienteFacade clienteEJB;
    
    /**
     * Buscar todos los clientes
     * 
     * @return 
     */
    @GET
    public List<Cliente> findAll(){
        return clienteEJB.findAll();
    }
     /**
      * Buscar clientes por id
      * 
      * @param id
      * @return 
      */
    @GET
    @Path("{id}")
    public Cliente findById(@PathParam("id") Integer id){        
        return clienteEJB.find(id);
    }
    /**
     * Crear un cliente    
     * 
     * @param cliente 
     */
    @POST
    public Response create(Cliente cliente){
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create(); 
        try {
                if (clienteEJB.findClienteByNumDocumento(cliente
                        .getNumDocumento()) == null) {
                    cliente.setPassword(DigestUtil.cifrarPassword(cliente.getPassword()));
                    clienteEJB.create(cliente);
                    return Response.status(Response.Status.CREATED)
                            .entity(gson.toJson("El usuario se registró correctamente"))
                            .build();
                } else {
                    return Response.status(Response.Status.BAD_REQUEST)
                            .entity(gson.toJson("El Número de documento ya éxiste!."))
                            .build();                
                }   

        } catch (Exception e) {
            System.out.println("Err: " + e);
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(gson.toJson("Error al registrar el usuario!."))
                    .build();
        }

    }
    /**
     * Editar cliente
     * 
     * @param cliente
     * @param id 
     */
    @PUT
    @Path("{id}")
    public void edit(@PathParam("id") Cliente cliente, Integer id){
        clienteEJB.edit(cliente);
    }
}
