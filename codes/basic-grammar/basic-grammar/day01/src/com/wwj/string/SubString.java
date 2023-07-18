package com.wwj.string;

public class SubString {
    public static void main(String[] args) {
        String str = "1234567";

        String res1 = str.substring(3);
        System.out.println(res1); // 4567

        String res2 = str.substring(2,5);
        System.out.println(res2); // 345
    }
}
