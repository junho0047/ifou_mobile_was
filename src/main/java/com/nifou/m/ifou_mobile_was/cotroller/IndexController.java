package com.nifou.m.ifou_mobile_was.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/testPage")
    public String test() {
        return "testPage";
    }
}