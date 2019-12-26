package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * user: chenyy1
 * date: 2019/12/26
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        return "Hello World";
    }
}
