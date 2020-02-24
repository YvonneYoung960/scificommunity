package com.scificommunity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * created by Young on 2020/2/21
 */

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
