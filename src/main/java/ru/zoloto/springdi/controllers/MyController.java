package ru.zoloto.springdi.controllers;

import org.springframework.stereotype.Controller;
import ru.zoloto.springdi.services.HelloService;

@Controller
public class MyController {

    private final HelloService helloService;

    public MyController(HelloService helloService) {
        this.helloService = helloService;
    }

    public String sayHello() {
        return "Hello, User!!!";
    }
}
