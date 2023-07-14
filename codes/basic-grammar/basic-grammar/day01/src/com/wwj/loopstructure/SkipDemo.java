package com.wwj.loopstructure;

public class SkipDemo {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++) {
            if (i == 3) continue;
            System.out.println("老虎吃了第" + i+ "个包子！");
        }

        System.out.println();

        for (int i=1;i<=5;i++) {
            if (i == 3) break;
            System.out.println("老虎吃了第" + i+ "个包子！");
        }
    }
}
