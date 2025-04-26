package com.spring.mvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.mvc.models.User;
import com.spring.mvc.services.UserService;


@Controller
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

   
    @GetMapping
    public String listUser(Model model){
        List <User> user = userService.getAllUsers();
        model.addAttribute("users",user);
        return "user/index";
    }

    @GetMapping("/{id}")
    public String listUserById(@PathVariable Long id, Model model){
        User users = userService.getUserById(id);
        model.addAttribute("user", users);
        return "user/detail";
    }
}
