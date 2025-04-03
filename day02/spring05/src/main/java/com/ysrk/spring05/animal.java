package com.ysrk.spring05;

// 부모클래스 동물 
public class Animal { // public : 어디서든지 불러서 사용 가능
    // String name; // 이름 아무것도 안 적음 -- default
    // public String name; // public
    private String name; // private 
    //protected String name; // protected
    int age;           // 동물의 나이

    public int getAge() {
        return age;
    }

    // 정확한 캡슐화를 위해서 필터링
    public void setAge(int age) {
        // 음수나 너무 큰 수가 들어가지 않도록 막아줌
        if (age < 0){
            this.age = 1; // 음수막기
        }  else if (age > 20) {
            this.age = 20; // 너무 큰 수 막기
        } else {
            this.age = age;
        }
    }
    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void cry() {
        System.out.println(this.name + "이(가) 웁니다");
    }

}
