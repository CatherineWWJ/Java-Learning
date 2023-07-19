package com.wwj.string;

import java.util.Scanner;

// 罗马数字转换练习题
public class RomanNumeralsTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        while (true) {
            System.out.println("请输入长度不大于9的数字：");
            s = sc.next();
            if (checkStr(s)) {
                break;
            }
            System.out.println("数字不符合要求！");
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(changeNumToRomanCase1(s.charAt(i) - '0')); // 注意：涉及字符串拼接要想到StringBuilder优化！
        }
        System.out.println(sb.toString());
    }

    public static String changeNumToRomanCase1(int n) {
        String[] ss = {"", "Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};
        return ss[n];
    }

    public static String changeNumToRomanCase2(char c) { // 将数字字符直接转换为罗马字符串
        String s = switch (c) { // switch的简写形式
            case '0' -> "";
            case '1' -> "Ⅰ";
            case '2' -> "Ⅱ";
            case '3' -> "Ⅲ";
            case '4' -> "Ⅳ";
            case '5' -> "Ⅴ";
            case '6' -> "Ⅵ";
            case '7' -> "Ⅶ";
            case '8' -> "Ⅷ";
            case '9' -> "Ⅸ";
            default -> "";
        };
        return s;
    }

    public static boolean checkStr(String s) { // 检查字符串是否符合要求
        if (s.length() > 9) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
