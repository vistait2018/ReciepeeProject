package com.vista.receipee.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping({"","/","index"})
    public String getIndex(){
        System.out.println("testine live reload");
        return "Index";
    }
}
