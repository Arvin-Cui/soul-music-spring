package com.bilitech.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@Slf4j
public class DefaultController {
    @GetMapping
    public String sayHello() {
        log.info("测试测试");
       return "hello";
    }
}
