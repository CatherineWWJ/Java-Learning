package com.wwj.logicoperator;

public class Demo1 {
    public static void main(String[] args) {
        // 逻辑运算符
        System.out.println(true & false); // false
        System.out.println(true | false); // true
        System.out.println(true ^ false); // true
        System.out.println(!true); // false

        // 短路逻辑运算符（常用）：如果左边能确定表达式结果，右边不执行
        System.out.println(false && true); // false
        System.out.println(true || false); // true
    }
}
