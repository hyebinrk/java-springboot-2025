package com.ysrk.spring01;

//implements로 가져오면 인터페이스 내의 추상메서드는 반드시 구현
//interface는 implements키워드를 반드시 사용해야 함 
public class Dog implements Animal {
    private String name;
    private int age;

    // 생성자
	Dog(String name, int age) {
		this.name = name;
        this.age = age;
    }

    @Override // 이제부터 오바라이딩(부모클래스에서 가지고있는 메서드를 자식클래스에서 재정의)할거야
    public void cry() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'cry'");
        System.out.println(this.age + "살 " this.name + "이(가) 웁니다. 멍멍!");
    }
    @Override //  default도 오버라이드 할 수 있다.
    public void introduce() {
        System.out.println("저는 강아지예요.");
    }
}
