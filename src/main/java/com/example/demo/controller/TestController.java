package com.example.demo.controller;
 
import java.util.HashMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
 
@RestController
public class TestController{
 
    @RequestMapping("/hello")
    public String getPage(HashMap<String, String> map){
        map.put("title", "欢迎来到Spring Boot!");
        return "index";
    }
}