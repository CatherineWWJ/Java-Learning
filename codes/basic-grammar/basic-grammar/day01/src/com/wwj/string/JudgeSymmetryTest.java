package com.wwj.string;

import java.util.Scanner;

// 判断回文字符串
public class JudgeSymmetryTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // 链式编程
        String s_ = new StringBuilder().append(s).reverse().toString();

        if (s.equals(s_)) {
            System.out.println(s + "是回文字符串");
        } else {
            System.out.println(s + "不是回文字符串");
        }
    }
}
