package com.example.first_spring_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.first_spring_app.domain.Message;
import com.example.first_spring_app.domain.User;
import com.example.first_spring_app.service.HelloWorldService;
import com.example.first_spring_app.service.Meeting;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping
public class HelloWorldController {

    @Autowired
    private Meeting meeting;

    private HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService){
        this.helloWorldService = helloWorldService;
    }

    @GetMapping("/hello")
    public Message helloWorld(){

        return new Message("deu certo");
        // return helloWorldService.sayHello("vininicius") + " " + meeting.niceToMeet();
    }

    @PostMapping("/hello")
    public String helloPost(@RequestBody User body){
        return "Hello, " + body.getName() + body.getEmail();
    }

    @PostMapping("/posts/{id}")
    public String paramsPost(@PathVariable String id){
        return id;
    }

}
