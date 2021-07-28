package com.dio.projetoSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontEndController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/hub")
    public String hub(){return "hub";}
}
