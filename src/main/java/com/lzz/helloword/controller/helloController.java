package com.lzz.helloword.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloController {
    @RequestMapping("/index")
    public String sayHello(){
        return "吕泽洲的HelloWord!";
    }

}
