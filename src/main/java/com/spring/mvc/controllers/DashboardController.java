package com.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
     @GetMapping("/dashboard")
    public String sayHello(Model theModel){
        theModel.addAttribute("theDate",java.time.LocalDate.now());
        return "Dashboard";
        
    }
    @GetMapping("/about")
    public String aboutPage(){
        return "about";
    }

    @GetMapping("/admin")
    public String adminPage(){
        return "admin/dashboard";
    }
}
