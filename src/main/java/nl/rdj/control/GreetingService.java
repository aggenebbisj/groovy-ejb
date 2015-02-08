
package nl.rdj.control;

import javax.ejb.Local;

@Local
public interface GreetingService {
    
    String greeting();
    
}
