package co.com.admin.remote.rest.services;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author Juan David Martinez
 */
@ApplicationPath("api")
public class AppConfig extends ResourceConfig{
         
    public AppConfig(){
        packages("co.com.admin.remote.rest.services;co.com.admin.remote.rest.auth");
    }
}
