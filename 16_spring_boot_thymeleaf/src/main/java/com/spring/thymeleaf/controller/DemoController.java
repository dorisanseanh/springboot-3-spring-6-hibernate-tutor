package com.spring.thymeleaf.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {
    @GetMapping
    public String demo(Model model) {
        model.addAttribute("message", java.time.LocalDate.now());
        return "demo";

    }

    @PostMapping("/processForm")
    public String submit() {
        return "form";
    }

    @PostMapping("/process")
    public String process(HttpServletRequest request, Model model) {
//        read the request parameter from the HTML form
        String theName = request.getParameter("name");
//        convert the data to all caps
        theName = theName.toUpperCase();
//        create the messagse
        String result = "Yo! " + theName;
        model.addAttribute("message", result);
        return "form";
    }

    @PostMapping("/processFormVersion")
    public String processFormVersion(@RequestParam("name") String theName, Model model) {
        theName = theName.toUpperCase();
        String result = "Hello my friend! " + theName;
        model.addAttribute("message", result);
        return "form";
    }
}
