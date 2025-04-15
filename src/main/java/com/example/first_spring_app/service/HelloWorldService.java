package com.example.first_spring_app.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String sayHello(String nome){
        return "Hello, " + nome;
    }

}
