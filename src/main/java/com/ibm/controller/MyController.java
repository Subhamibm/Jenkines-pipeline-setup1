package com.ibm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MyController {

    @GetMapping("/getdata")
    public String getData(){
        return "Hello, I am from getData";
    }

    @GetMapping("/ibm")
    public String getIBM(){
        return "Hello, I am from IBM";
    }

    @PostMapping("/postdata")
    public String postData(){
        return "Hello, I am from postData, your data is being updated...";
    }
}
