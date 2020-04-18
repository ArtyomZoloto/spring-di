package ru.zoloto.springdi.services.i18n;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import ru.zoloto.springdi.services.HelloService;

@Profile({"RU", "default"})
@Service
public class RussianHelloService implements HelloService {
    @Override
    public String sayHello() {
        return "Привет из России!";
    }
}
