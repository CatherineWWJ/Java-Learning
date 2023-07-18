package com.wwj.string;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = "abc";
        String s3 = "ABC";

        System.out.println(s1 == s2); // false

        // 比较字符串内容
        boolean flag = s1.equals(s2);
        System.out.println(flag); // true

        flag = s1.equals(s3);
        System.out.println(flag); // false

        flag = s1.equalsIgnoreCase(s3); // 比较时忽略大小写
        System.out.println(flag); // true

        Scanner sc = new Scanner(System.in);
        String s4 = sc.next(); // 键盘录入的字符串同样在底层是new出来的
        System.out.println(s2 == s4); // false

        // 总结：以后如果想要比较字符串中的内容，统一使用字符串的方法！
    }
}
