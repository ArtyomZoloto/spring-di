package ru.zoloto.springdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("IT")
@Service
public class ItalianHelloService implements HelloService {
    @Override
    public String sayHello() {
        return "Ciao, Artur!";
    }
}
