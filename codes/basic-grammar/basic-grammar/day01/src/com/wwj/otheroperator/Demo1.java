package com.wwj.otheroperator;

public class Demo1 {
    public static void main(String[] args) {
        int a = 200;
        int b = 10;
        System.out.println(a & b); // 二进制按位与
        System.out.println(a | b); // 二进制按位或
        System.out.println(a << 2); // 向左移动，低位补0
        System.out.println(a >> 2); // 向右移动，高位补符号位
        System.out.println(a >>> 2); // 无符号右移，高位补0
    }
}
