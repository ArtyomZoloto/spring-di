package guru.springframework.sfgdi.services.greetings;

import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/27/19.
 */
@Service("setter-service")
public class SetterInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
