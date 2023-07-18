package com.wwj.string;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        // 构造方法一
        StringJoiner sj = new StringJoiner("---"); // 指定分隔符

        // 添加元素
        sj.add("a").add("b").add("c");
        System.out.println(sj); // a---b---c

        // 获取长度
        int len = sj.length();
        System.out.println("长度为：" + len);

        // 构造方法二
        StringJoiner sj2 = new StringJoiner(", ","[","]"); // 指定分隔符、首符号、尾符号
        sj2.add("w").add("w").add("j");
        System.out.println(sj2);

        // 转为字符串
        String s = sj2.toString();
        System.out.println(s);
    }
}
