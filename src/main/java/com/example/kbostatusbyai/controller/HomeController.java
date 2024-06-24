package com.example.kbostatusbyai.controller;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@NoArgsConstructor
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
//        model.addAttribute("message", "Welcome to KBO Status!");
        return "index";
    }
}