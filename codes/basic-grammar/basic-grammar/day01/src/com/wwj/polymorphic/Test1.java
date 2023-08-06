package com.wwj.polymorphic;

public class Test1 {
    public static void main(String[] args) {
        Student s = new Student("lyc", 11);
        Teacher t = new Teacher("zp", 30);

        register(s); // 学生的信息为：lyc, 11
        register(t); // 老师的信息为：zp, 30
    }

    public static void register(Person p) {
        p.show();
    }
}
