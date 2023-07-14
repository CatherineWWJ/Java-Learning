package com.wwj.loopstructure;

import java.util.Scanner;

// 题目：判断输入的整数是否为回文？
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int init = sc.nextInt();
        int num = init;
        int reverse = 0;
        while (num > 0) {
            reverse *= 10;
            reverse += num%10;
            num /= 10;
        }
        if (init == reverse) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
