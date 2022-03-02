package com.rest.factoria.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {

    @GetMapping("hello")
    public String Hello(){
        return "Hello";
    }
}
