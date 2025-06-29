package com.example.demoMVCpackage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

// A simple controller using spring
// web annotations
@Controller
public class LoginController {

    // returning the login jsp
    // for root of the webpage
    @GetMapping("/")
    public String home(){
        return "login.jsp";
    }

    // mapping the /login request
    // requestparam is used to get the value
    // from get request parameters
    // returns ModelAndView
    //We should ideally use a POST mapping for a form
    //@GetMapping("/login")
    @PostMapping("/login")
    public ModelAndView loginActionUsingModelAndView(
            @RequestParam("name") String name,
            @RequestParam("password") String pass,
            ModelAndView modelAndView
    ){

        modelAndView.addObject("userName", name);
        modelAndView.addObject("password", pass);
        modelAndView.setViewName("result.jsp");

        return modelAndView;
    }
}