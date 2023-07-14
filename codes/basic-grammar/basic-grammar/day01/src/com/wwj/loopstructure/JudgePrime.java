package com.wwj.loopstructure;

import java.util.Scanner;

public class JudgePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        boolean flag = true;

        for (int i = 2; i < number; i++) { // 判断条件：可以优化为number的平方根
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        System.out.println(number + (flag?"是质数":"不是质数"));
    }
}
