package com.wwj.arithmeticoperator;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(3 + 2);
        System.out.println(5 - 1);
        System.out.println(7 * 9);

        // 代码中，如果有小数参与计算，结果有可能不精确
        System.out.println(1.1 + 1.1);  // 2.2
        System.out.println(1.1 + 1.01); // 2.1100000000000003
        System.out.println(1.1 - 1.01);
        System.out.println(1.1 * 1.01);

        // 连续+：从左到右逐个执行
        System.out.println(1 + 99 + "周年快乐！"); // 100周年快乐！
    }
}
