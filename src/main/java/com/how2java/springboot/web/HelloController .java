package com.how2java.springboot.web;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {

    @RequestMapping("/zhangqinyu")
    public String hello() {
        return "Hello zhangqinyu!";
    }

}