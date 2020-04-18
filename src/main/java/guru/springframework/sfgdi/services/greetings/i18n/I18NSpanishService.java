package guru.springframework.sfgdi.services.greetings.i18n;

import guru.springframework.sfgdi.services.greetings.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/27/19.
 */
//@Profile({"ES", "default"})
@Service("es-service")
public class I18NSpanishService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}