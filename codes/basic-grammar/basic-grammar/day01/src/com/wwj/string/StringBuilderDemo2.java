package com.wwj.string;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        // 容量
        // 长度
        System.out.println(sb.capacity()); // 16
        System.out.println(sb.length()); // 0

        sb.append("abcdefghijklmnopqrstuvwxyz0123456789");
        System.out.println(sb.capacity()); // 36
        System.out.println(sb.length()); // 36
    }
}
