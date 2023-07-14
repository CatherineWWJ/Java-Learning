package com.wwj.loopstructure;

public class WhileDemo {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        // for和while的区别：
        // 当知道循环的范围或者次数时，就用for
        // 否则，就用while
    }
}
