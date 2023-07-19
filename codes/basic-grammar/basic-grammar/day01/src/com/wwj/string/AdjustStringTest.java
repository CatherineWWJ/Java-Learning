package com.wwj.string;

import java.util.Scanner;

/*
* s：输入的5位字符串
* s2：对比的5位字符串
* 旋转一次：s字符串的最左边挪到最右边（循环左移）
* 问：s经过若干次旋转是否可以变换为s2？？？
*/
public class AdjustStringTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        while (true) {
            System.out.println("请输入一个五位数的字符串：");
            s = sc.next();
            if (s.length() == 5) {
                break;
            }
            System.out.println("输入不符合要求，请重新输入！");
        }
        String s2 = "cdeab";
        boolean result = false;
        for (int i = 0; i < 5; i++) {
            s = rotateStr(s);
            if (s.equals(s2)) {
                result = true;
            }
        }
        System.out.println(result);
    }

    public static String rotateStr(String s) { // 方式一
        char start = s.charAt(0);
        String end = s.substring(1);
        return end + start;
    }

    public static String rotateStr2(String s) { // 方式二
        char[] chs = s.toCharArray(); // String转字符数组
        char start = chs[0];
        for (int i = 1; i < chs.length; i++) {
            chs[i-1] = chs[i];
        }
        chs[chs.length - 1] = start;
        String result = new String(chs);
        return result;
    }
}
