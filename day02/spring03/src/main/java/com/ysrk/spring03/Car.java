package com.ysrk.spring03;

    public class Car {
        public String name;
        public int year;
        public String company;
    
        public void printCarName() {
            System.out.println("차 이름은 " + name);
        }
    
        // 메서드 오버로딩
        public void printCarName(Strng point) {
            System.out.println("차 이름은 " + name + " 포인트는 " + point);
        }
    
        // 가변인자
        public void printCarName(String...name) {
            for (String n :name) {
                System.out.println(n);
            }
        }
    
        int clacYear(int currYear) {
            return currYear - year;
        }

        public static void printYear(){
            System.out.println
        }

    }

