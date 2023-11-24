package com.ex1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Ex1Controller {

    // 기본 폴더 templates로 지정
    @GetMapping("/")
    public String mainCall(Model model) {
        return "/index";
    }
}
