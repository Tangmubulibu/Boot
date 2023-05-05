package com.atstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CateIdC {
    @RequestMapping("/home")
    public String one (){
        return "home";
    }
    @RequestMapping("/index")
    public String two (){
        return "index";
    }
    @RequestMapping("/login")
    public String three (){
        return "login";
    }
}