package ru.zoloto.springdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("Default")
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "Hello, Artyom! Its From " + this.getClass().getSimpleName();
    }
}
