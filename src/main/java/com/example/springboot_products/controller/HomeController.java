package com.example.springboot_products.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class HomeController
{
    @GetMapping(path = "/", produces = "application/json")
    public String handleInitial()
    {
        return "hello, here is product";
    }
}
