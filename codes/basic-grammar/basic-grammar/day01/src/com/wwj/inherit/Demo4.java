package com.wwj.inherit;

// this的使用
public class Demo4 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        System.out.println(t.school);
    }
}

class Teacher {
    String name;
    String school;

    public Teacher() {
        this(null, "hust"); // 给所有的老师设置默认学校
    }

    public Teacher(String name, String school) {
        this.name = name;
        this.school = school;
    }
}
