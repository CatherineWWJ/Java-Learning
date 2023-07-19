package com.wwj.arraylist;

import java.util.ArrayList;

public class CreateDemo {
    public static void main(String[] args) {
        // <>指的是泛型，限定了集合中存储数据的类型
        // 注意：集合只能存储引用数据类型 + 包装类（基本数据类型的）
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
    }
}
