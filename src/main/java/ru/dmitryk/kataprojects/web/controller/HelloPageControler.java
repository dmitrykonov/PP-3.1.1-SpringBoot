package ru.dmitryk.kataprojects.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloPageControler {

    @GetMapping("/")
    public String hello() {
        return "hello_page";
    }
}
