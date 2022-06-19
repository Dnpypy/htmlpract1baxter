package ru.template.baxter.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/about")
    public String about(@RequestParam(value = "name", defaultValue = "World!") String name){
        return String.format("about %s", name);
    }
}
