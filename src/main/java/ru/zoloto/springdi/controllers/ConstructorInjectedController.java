package ru.zoloto.springdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import ru.zoloto.springdi.services.HelloService;

@Controller
public class ConstructorInjectedController {

    private final HelloService helloService;

    public ConstructorInjectedController(@Qualifier("ItalianHelloService") HelloService helloService) {
        this.helloService = helloService;
    }

    public String sayHello(){
        return helloService.sayHello();
    }
}
