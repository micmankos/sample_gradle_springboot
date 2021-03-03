package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndPoints {
    @GetMapping(value="/testing")
    public String Welcome() {
        return "Hello this is a GET endpoint";
    }

}
