package com.go.home.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(name = "/home",method = RequestMethod.GET)
    public String home(){

        return "";
    }

}
