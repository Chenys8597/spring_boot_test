package com.example.spring_boot_test.controller;

import com.example.spring_boot_test.model.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public Test getTest(){
        System.out.println("1");
        return new Test("test");
    }

}
