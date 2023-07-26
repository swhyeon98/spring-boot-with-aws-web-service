package com.book.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "스프링 부트 웹서비스");
        model.addAttribute("header", "스프링 부트로 시작하는 웹 서비스");
        return "index";
    }
}
