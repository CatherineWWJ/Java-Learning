package com.wwj.demo;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // 键盘录入
        Scanner sc = new Scanner(System.in);
        // 第一套体系：遇到空格、制表符、回车就停止接收
        int num = sc.nextInt(); // 整数
        double price = sc.nextDouble(); // 小数
        String name = sc.next(); // 字符串

        // 第二套体系：可以接收空格、制表符，遇到回车才停止接收
        String info = sc.nextLine(); // 字符串

        // 提示：键盘录入的两套体系尽量不要混用
        // 弊端：先用nextInt再用nextLine会导致后者接收不到数据
    }
}
