package com.wwj.branchstructure;

// 介绍switch的简化写法
public class SwitchDemo2 {
    public static void main(String[] args) {
        int number = 1;
        switch (number) { // 箭头写法没有case穿透，是JDK12之后引入的新特性
            case 1 -> {
                System.out.println("一");
            }
            case 2 -> System.out.println("二"); // 一行语句可以省略大括号
            case 3 -> System.out.println("三");
            default -> System.out.println("没有这种选项");
        }
    }
}
