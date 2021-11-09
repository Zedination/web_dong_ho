package com.ducla12.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/index")
    public String index(){
        return "admin/index";
    }

    @GetMapping("/product")
    public String productPage() {
        return "admin/product";
    }

    @GetMapping("/brand")
    public String brandPage(Model model) {
        model.addAttribute("title", "Quản lý thương hiệu");
        return "admin/brand";
    }
}
