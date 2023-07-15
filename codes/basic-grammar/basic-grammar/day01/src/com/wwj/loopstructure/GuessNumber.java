package com.wwj.loopstructure;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100) + 1; // [0,100) + 1 = [1,100]

        int count = 0; // 扩展：保底机制

        Scanner sc = new Scanner(System.in);
        int inputVal;

        while (true) {
            inputVal = sc.nextInt();
            count++;
            if (count >= 3) { // 猜到第3次，不管猜没猜中
                System.out.println("猜中啦");
                break;
            }
            if (inputVal == number) {
                System.out.println("猜对啦！");
                break;
            } else if (inputVal < number) {
                System.out.println("猜小啦！");
            } else {
                System.out.println("猜大啦！");
            }
        }
    }
}
