package ru.zoloto.springdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Service
public class ItalianHelloService implements HelloService {
    @Override
    public String sayHello() {
        return "Ciao, Artur!";
    }
}
