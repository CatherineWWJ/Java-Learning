package com.wwj.array;

import java.util.Random;

// 打乱数组
public class Disorganize {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Random r = new Random();

        int randomIndex, temp;
        for (int i = 0; i < arr.length; i++) {
            randomIndex = r.nextInt(arr.length); // 随机生成索引与当前索引进行交换
            temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
