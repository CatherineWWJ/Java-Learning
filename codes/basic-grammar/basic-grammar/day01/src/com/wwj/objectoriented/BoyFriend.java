package com.wwj.objectoriented;

public class BoyFriend {
    // 成员变量
    private String name; // 用private修饰之后，就不能通过对象.属性名去操作成员变量了，防止非法操作
    private int age;

    // 方法体中的变量是：局部变量
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
