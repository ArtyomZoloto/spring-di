package guru.springframework.sfgdi.services.greetings;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/27/19.
 */
@Primary
@Service("primary-service")
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - From the PRIMARY Bean";
    }
}
