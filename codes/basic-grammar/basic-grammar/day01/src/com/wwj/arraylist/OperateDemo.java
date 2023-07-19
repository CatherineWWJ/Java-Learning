package com.wwj.arraylist;

import java.util.ArrayList;

public class OperateDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // 增
        list.add("abc");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);

        // 删
        boolean flag = list.remove("bbb");
        System.out.println(flag);
        System.out.println(list);

        String del = list.remove(1);
        System.out.println("被删除的元素为：" + del);
        System.out.println(list);

        // 改
        String change = list.set(0, "hhh");
        System.out.println("被修改的元素为：" + change);
        System.out.println(list);

        // 查
        String find = list.get(0);
        System.out.println("第一个元素为：" + find);

        int len = list.size();
        System.out.println("集合的长度为：" + len);
    }
}
