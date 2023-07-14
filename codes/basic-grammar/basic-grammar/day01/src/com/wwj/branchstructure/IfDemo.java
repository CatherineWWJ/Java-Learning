package com.wwj.branchstructure;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wine = sc.nextInt();
        if (wine > 20) {
            System.out.println("小伙子可以啊！");
        } else {
            System.out.println("继续努力！");
        }

        boolean isGreenLight = true;
        if (isGreenLight) System.out.println("gogogo!"); // 单行语句可以省略大括号
    }
}
