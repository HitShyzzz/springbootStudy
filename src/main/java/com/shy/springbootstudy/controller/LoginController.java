package com.shy.springbootstudy.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2023/07/16/21:46
 * @Description:
 */
@Controller
public class LoginController {
    @RequestMapping("/user/login")
    public String login(@RequestParam( "username") String username, @RequestParam( "password") String password, Model model, HttpSession session) {
        // 具体的业务
        if (!StringUtils.isEmpty(username)&&"123456".equals(password)){
            session.setAttribute("loginUser",username);
            return "redirect:/main.html";
        }else{
            model.addAttribute("msg","用户名或者密码错误！");
            return "index";
        }
    }
}
