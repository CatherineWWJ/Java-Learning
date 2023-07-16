package com.wwj.method;

public class Demo3 {
    public static void main(String[] args) {
        boolean flag = true;
        extracted(flag); // 快捷键：自动抽取方法（Ctrl + alt + M）（option + command + M）
    }

    private static void extracted(boolean flag) {
        if (flag) {
            System.out.println("win");
        } else {
            System.out.println("defeat");
        }
    }
}
