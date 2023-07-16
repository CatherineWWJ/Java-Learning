package com.wwj.Array;

public class TwoDimension {
    public static void main(String[] args) {
        // 静态初始化
        int[][] arr = new int[][]{
                {1,2,3},
                {4,5,6,7,8}
        };

        // 遍历二维数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // 动态初始化
        int[][] arr2 = new int[2][];
        int[] arr3 = {1,2};
        int[] arr4 = {9,8,7};
        arr2[0] = arr3; // arr2[0]存储的是堆空间开辟的一维数组arr3的地址值，默认为null
        arr2[1] = arr4;
    }
}
