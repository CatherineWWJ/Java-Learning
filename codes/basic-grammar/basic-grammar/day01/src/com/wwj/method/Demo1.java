package com.wwj.method;

public class Demo1 {
    public static void main(String[] args) {
        playGame();
        int sum = getSum(10,20);
        System.out.println(sum);
    }

    public static void playGame() {
        System.out.println("选人物");
        System.out.println("开局");
        System.out.println("结束");
    }

    public static int getSum(int a, int b) {
        return a + b;
    }
}
