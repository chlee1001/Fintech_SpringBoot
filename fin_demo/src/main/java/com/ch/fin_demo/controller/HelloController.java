package com.ch.fin_demo.controller;

import com.ch.fin_demo.model.Hello;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloController {

    @GetMapping("hello-mvc")
    public String helloTemplate(String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping(value = "hello-string")
    @ResponseBody
    public String helloString(String name) {
        return String.format("Hello, %s", name);
    }


    @GetMapping("hello-map")
    @ResponseBody
    public Map<String, Object> helloMap(String name) {
        Map<String, Object> m = new HashMap<>();
        m.put("name", name);
        return m;
    }

    @GetMapping("hello-object")
    @ResponseBody
    public Hello helloObject(String name) {
        Hello h = new Hello(name);
        return h;
    }

}
