package com.ch.fin_demo.model;

import lombok.Data;

@Data
public class Hello {
    final String name; // final 붙힌 이유는 requirement argument로 지정해주기 위해서 ==> RequiredArguConstructor


//    // @NonNull
//    // String name;

//    String name;
//
//    public Hello(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
}
