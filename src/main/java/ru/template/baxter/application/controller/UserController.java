package ru.template.baxter.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class UserController {


    @GetMapping("/about")
    public String about(@RequestParam(value = "name", defaultValue = "World!") String name, Model model){
        model.addAttribute("name", name);
        return "about";
    }

    @GetMapping("/services")
    public String services(@RequestParam(value = "name2", defaultValue = "World!") String name, Model model){
        model.addAttribute("name2", name);
        return "services";
    }

}
