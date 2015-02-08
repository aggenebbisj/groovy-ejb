
package nl.rdj.boundary;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import nl.rdj.control.GreetingService;

@Path("greets")
public class JavaBoundary {

    @EJB
    GreetingService service;
    
    @GET 
    @Produces(MediaType.APPLICATION_JSON)
    public String get() {
        return service.greeting();
    }
    
}
