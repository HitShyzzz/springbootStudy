package com.shy.springbootstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/07/14/17:19
 * @Description:
 */
// templates目录下的页面只能通过controller层来跳转访问
@Controller
public class IndexController {

//    @RequestMapping({"/index.html","/index"})
//    public String index(){
//        return "index";
//    }
    @RequestMapping("/test")
    public String test(Model model){
        model.addAttribute("msg","<h1>hello, spring boot~</h1>");
        model.addAttribute("users", Arrays.asList("shy","lay"));
        return "test";
    }
}


