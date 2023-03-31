package com.maven.firstproject.controller;

import com.maven.firstproject.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @Autowired
    FirstService firstService;

    @GetMapping(value = "/product")
    public String getString(){
        return firstService.returnString();
    }

    @GetMapping(value = "/")
    public String getString1(){
        return "to test it on tomcat";
    }

    @PostMapping(value = "/product")
    public  String search1(){
        return  "Hello ji";
    }
}
