package ru.job4j.dream.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
@Controller
public class IndexControl {

    @GetMapping("/index")
    public String index() {
        return "index";
    }
}