package com.spring.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping
    public String demo(Model model) {
        model.addAttribute("message", java.time.LocalDate.now());
        return "demo";
    }
}
