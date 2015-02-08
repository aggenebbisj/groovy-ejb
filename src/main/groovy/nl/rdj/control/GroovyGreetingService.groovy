package nl.rdj.control

import javax.ejb.Stateless

@Stateless
class GroovyGreetingService implements GreetingService {
    
    String greeting() { "Hello from Groovy!" }
    
}

