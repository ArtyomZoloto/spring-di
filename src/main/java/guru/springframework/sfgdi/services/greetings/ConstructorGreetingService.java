package guru.springframework.sfgdi.services.greetings;

import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/26/19.
 */
@Service("constructor-service")
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}