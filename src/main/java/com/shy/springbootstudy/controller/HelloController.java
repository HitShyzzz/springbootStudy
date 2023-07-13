package com.shy.springbootstudy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/07/13/19:00
 * @Description:
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public  String hello(){
        return "Hello World";
    }
}
