package com.ysrk.spring05;

// 부모클래스 동물 
public class animal {
    String name;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void cry() {
        System.out.println(this.name + "이(가) 웁니다")
    }

}
