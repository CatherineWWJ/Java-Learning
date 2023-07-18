package com.wwj.string;

// StringBuilder内容可变，String内容不可变
public class StringBuilderDemo {
    /*
    使用StringBuilder的场景：
    1.字符串的拼接
    2.字符串的反转
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("投币");
        System.out.println(sb); // 说明：java在StringBuilder的底层进行特殊处理，打印对象是属性值不是地址值

        // 添加元素
        sb.append("wwj");
        System.out.println(sb);

        // 反转
        sb.reverse();
        System.out.println(sb);

        // 获取长度
        int len = sb.length();
        System.out.println("长度为：" + len);

        // 转换为String对象
        String s = sb.toString();
        System.out.println(s);
    }
}
