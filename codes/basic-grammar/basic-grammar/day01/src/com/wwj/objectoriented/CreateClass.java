package com.wwj.objectoriented;

public class CreateClass {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.brand = "华为";
        p.price = 6999;
        System.out.println(p.brand);
        System.out.println(p.price);
        p.call(); // 快捷键：选中竖着同一行（按住鼠标滚轮拖）（按住alt + 鼠标左键拖）
        p.playGames();

        BoyFriend bf1 = new BoyFriend();
        bf1.setName("czy");
        bf1.setAge(24);
        System.out.println(bf1.getName());
        System.out.println(bf1.getAge());

        BoyFriend bf2 = new BoyFriend("东方青仓", 20);
        System.out.println(bf2.getName());
        System.out.println(bf2.getAge());

        System.out.printf("my name is %s", "wwj");
        System.out.println("hello world");
    }
}
