package com.ch.fin_demo.controller;

import com.ch.fin_demo.model.Hello;
import com.ch.fin_demo.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController //=@Controller+@ResponseBody
@RequiredArgsConstructor
public class HelloRestController {

    // Bean 주입...DI
//    // Setter~~~
//    MemberService memberService;
//
//    @Autowired
//    private void setMemberService(MemberService memberService) {
//        this.memberService = memberService;
//    }
//--------------------------------------------------------------------
//    // Field Injection  추천 하지 않음 메소드가 열림?
//    @Autowired
//    MemberService memberService;
//--------------------------------------------------------------------
//    // Constructor injection (권장.. 안전한 방법)
//    final MemberService memberService; // 변화를 막음
//
//    @Autowired
//    public HelloRestController(MemberService memberService) {
//        this.memberService = memberService;
//    }
//--------------------------------------------------------------------
    final MemberService memberService; // 가장 쉬운 방법 (lombok...@RequiredArgsConstructor) -- Auto Constructor Injection

    @GetMapping(value = "hello-string")
    public String helloString(String name) {
        return memberService.greet(name);
    }


    @GetMapping("hello-map")
    public Map<String, Object> helloMap(String name) {
        Map<String, Object> m = new HashMap<>();
        m.put("name", name);
        return m;
    }

    @GetMapping("hello-object")
    public Hello helloObject(String name) {
        Hello h = new Hello(name);
        return h;
    }
}
