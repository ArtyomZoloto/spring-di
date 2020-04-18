package guru.springframework.sfgdi.services.greetings.i18n;

import guru.springframework.sfgdi.services.greetings.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/27/19.
 */
@Profile("EN")
@Service("en-service")
public class I18nEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
