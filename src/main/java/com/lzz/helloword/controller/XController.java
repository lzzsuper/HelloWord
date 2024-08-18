package com.lzz.helloword.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class XController {
    @RequestMapping("/X")
    public String xPrint() {
        System.out.println("Hello");
        System.out.println("World");
        return "X";

    }

}
