package com.rcoem.devops.interfaces;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to the DevOps Application!");
        return "index"; // Thymeleaf will look for a template called 'index.html'
    }
}
