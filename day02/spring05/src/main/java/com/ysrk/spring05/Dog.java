package com.ysrk.spring05;

// Animal 부모클래스
public class Dog extends Animals {
    
    // 부모 메서드 오버라이딩
    void cry() {
        System.out.println(super.name + "이(가) 웁니다. 멍멍!!")
    }
}
