package com.kenkousen.tutorials.demowithkenkousen;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    public String getpage(@RequestParam() String name,Model model){
model.addAttribute("user", name);
System.out.println("hey");
model.addAttribute("user", name);
        return "hello";

    }

    
}
