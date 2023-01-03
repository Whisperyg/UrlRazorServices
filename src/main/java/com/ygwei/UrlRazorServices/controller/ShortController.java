package com.ygwei.UrlRazorServices.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan("com.ygwei")
@RestController
public class ShortController {

    @PostMapping("/shorter/post")
    public String shorter(String url) {
        codeC1 input = new codeC1(url);
        return " shortened url using method 1:" + input.encode1() +
                " shortened url using method 2:" + input.encode2() +
                " shortened url using method 3:" + input.encode3();
//        return "nt shortened url" + url;
    }
}
