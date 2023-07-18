package com.wwj.string;

import java.util.Scanner;

public class Traverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // 注意：获取字符串的长度为length方法；而获取数组的长度为length属性
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // 字符串指定索引的字符
            System.out.println(c);
        }
    }
}
