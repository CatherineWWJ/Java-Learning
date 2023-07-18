package com.wwj.string;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        // 容量
        // 长度
        System.out.println(sb.capacity()); // 16
        System.out.println(sb.length()); // 0

        sb.append("abc");
        System.out.println(sb.capacity()); // 16
        System.out.println(sb.length()); // 3

        sb.append("defghijklmnopqrstuvwxyz");
        System.out.println(sb.capacity()); // 34
        System.out.println(sb.length()); // 26

        sb.append("0123456789");
        System.out.println(sb.capacity()); // 70
        System.out.println(sb.length()); // 36
    }
}
