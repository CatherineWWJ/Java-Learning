package com.wwj.arithmeticoperator;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(10 / 2);
        System.out.println(10 / 3); // 整数参与计算，结果只能得到整数
        System.out.println(10.0 / 3); // 小数参与计算，结果可能不精确

        System.out.println(10 % 2);
        System.out.println(10 % 3);
    }
}
