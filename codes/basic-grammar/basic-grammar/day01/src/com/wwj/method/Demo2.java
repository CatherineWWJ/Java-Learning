package com.wwj.method;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(3,4,5));
    }

    // 方法的重载

    public static int sum(int a, int b) { // 2个数求和
        return a + b;
    }

    public static int sum(int a, int b, int c) { // 3个数求和
        return a + b + c;
    }
}
