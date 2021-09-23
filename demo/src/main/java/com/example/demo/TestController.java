package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("index")
    public String index(){
        System.out.println("跳转到index界面");
        return "index";
    }
}
