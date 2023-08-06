package com.wwj.innerclass;

public class Test {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        System.out.println(oi.book);

        oi.show();

        Outer.Inner2 oi2 = new Outer.Inner2();
        oi2.show1();
        Outer.Inner2.show2();
    }
}
