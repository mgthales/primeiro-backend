package com.monteiro.first_spring_app.controller;

import com.monteiro.first_spring_app.domain.User;
import com.monteiro.first_spring_app.service.HelloWorldService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
    // post, get , delete, put, patch, options, head

    @Autowired
   private HelloWorldService helloWorldService;



    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld("Thalesss");
    }

    @PostMapping("/{id}")
public String helloWorldPost(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody User body) {
        return "Ola Sr. " + body.getName() + ", Seu email e qual? " + body.getEmail() + " Seu Id e " + id + " " + filter;
    }
}
