package guru.springframework.sfgdi.services.greetings;

import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/27/19.
 */
@Service("props-service")
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
