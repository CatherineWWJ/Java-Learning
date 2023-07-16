package com.wwj.Array;

public class CreateArray {
    public static void main(String[] args) {
        // 静态初始化
        int[] arr1 = new int[]{11,12,13,14,15};
        int[] arr2 = {1,2,3,4};

        String[] names = {"张三", "李四", "王五"};

        // 动态初始化：虚拟机给初始化值
        int[] arr3 = new int[3];
        arr3[0] = 10;
        arr3[1] = 24;
        System.out.println(arr3[2]);
    }
}
