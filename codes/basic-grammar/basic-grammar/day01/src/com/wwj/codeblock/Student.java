package com.wwj.codeblock;

public class Student {
    private String name;
    private int age;

    static {
        System.out.println("这里是静态代码块，用于初始化信息，只会执行一次");
    }

    // 构造代码块
    {
        System.out.println("开始构造对象了");
    }
    public Student() {
        System.out.println("无参的构造方法");
    }

    public Student(String name, int age) {
        System.out.println("有参的构造方法");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
