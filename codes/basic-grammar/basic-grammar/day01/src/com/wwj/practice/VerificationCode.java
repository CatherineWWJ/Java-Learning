package com.wwj.practice;

import java.util.Random;

// 生成随机验证码，前四位为随机字母，最后一位随机数字
public class VerificationCode {
    public static void main(String[] args) {
        // 以后如果要在一堆没有规律的数据中随机抽取，可以先把数据放到数组中，再随机抽取索引
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i < 26) {
                chs[i] = (char)('a' + i);
            } else {
                chs[i] = (char)('A' + i - 26);
            }
        }
//        printChs(chs);

        Random r = new Random();
        String result = "";
        for (int i = 0; i < 4; i++) {
            result += chs[r.nextInt(chs.length)];
        }
        result += r.nextInt(10);
        System.out.println(result);
    }

    public static void printChs(char[] chs) {
        for (int i = 0; i < chs.length; i++) {
            System.out.print(chs[i] + " ");
        }
    }
}
