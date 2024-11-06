package com.monteiro.first_spring_app.configuration;


import com.monteiro.first_spring_app.domain.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

@Configuration
public class HelloConfiguration {

    @GetMapping("")
    public String helloWorld() {
        return "Ola Mundo";
    }

}