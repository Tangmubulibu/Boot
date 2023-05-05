package com.atstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//表明这是一个启动类
@SpringBootApplication
//版本mvc版本过高时加
//@EnableWebMvc
//出问题了再加，默认扫描启动类同级的所有包
//@ComponentScan(basePackages = "com.atstudy")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
