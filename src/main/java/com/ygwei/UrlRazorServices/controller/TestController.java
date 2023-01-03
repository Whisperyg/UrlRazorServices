package com.ygwei.UrlRazorServices.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan("com.ygwei")

@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello() {
        return "hello!";
    }


    @PostMapping("/hello/post")
    public String helloPost(String url) {
        return "hello world! Post " + url;
    }
}

