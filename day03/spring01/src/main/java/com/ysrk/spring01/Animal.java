package com.ysrk.spring01;

public interface Animal {
    // public String name = "이름";
    // public int age = 1;
    
    void cry(); // 내부구현이 없음 (Animal이라는 인터페이스를 구현하려면 cry를 써야해! 라는 것임)
    
    // 메서드 구현이 들어갈 수 있음. 예외적 사용
    public default void introduce(){
        System.out.print("저는 동물이에요.");
    }

}
