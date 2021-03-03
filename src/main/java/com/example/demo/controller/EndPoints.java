package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndPoints {
    @GetMapping(value="/testing")
    public String Welcome() {
        return "Hello this is a GET endpoint";
    }

    @PostMapping(path= "/postTest")
    public String addEmployee(@RequestBody String req) throws Exception
    {
        System.out.println("Req: " + req);
        return "You have hit the POST endpoint";
    }
}
