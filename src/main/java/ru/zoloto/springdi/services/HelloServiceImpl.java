package ru.zoloto.springdi.services;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "Hello, Artyom! Its From " + this.getClass().getSimpleName();
    }
}
