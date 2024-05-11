package com.example.tareadoce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/table")
    public String mostrarUsuarios(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "table";
    }
}
