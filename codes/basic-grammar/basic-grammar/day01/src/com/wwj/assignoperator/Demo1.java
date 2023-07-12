package com.wwj.assignoperator;

public class Demo1 {
    public static void main(String[] args) {
        int a = 10;
        a += 20;
        System.out.println(a); // 30

        a -= 5;
        System.out.println(a); // 25

        a *= 4;
        System.out.println(a); // 100

        a /= 2;
        System.out.println(a); // 50

        a %= 3;
        System.out.println(a); // 2
    }
}
