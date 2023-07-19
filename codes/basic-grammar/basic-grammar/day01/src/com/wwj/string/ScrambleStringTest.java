package com.wwj.string;

import java.util.Random;
import java.util.Scanner;

public class ScrambleStringTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请任意输入一个字符串：");
        String s = sc.next();
        char[] chs = s.toCharArray();

        Random r = new Random();
        int randomIndex;
        char temp;
        for (int i = 0; i < chs.length; i++) {
            randomIndex = r.nextInt(chs.length);
            temp = chs[i];
            chs[i] = chs[randomIndex];
            chs[randomIndex] = temp;
        }
        String result = new String(chs);
        System.out.println("打乱后的字符串为：" + result);
    }
}
