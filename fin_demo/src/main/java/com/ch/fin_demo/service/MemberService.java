package com.ch.fin_demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service

public class MemberService {

    public String greet(String name) {
        return String.format("Welcome, %s", name);
    }
}

