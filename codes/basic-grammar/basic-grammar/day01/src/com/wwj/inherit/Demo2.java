package com.wwj.inherit;

// 继承关系中调用成员方法：就近原则
public class Demo2 {
    public static void main(String[] args) {
        Student s = new Student();
        s.lunch();
    }
}

class Person {
    public void eat() {
        System.out.println("吃饭");
    }

    public void drink() {
        System.out.println("喝水");
    }
}

class Student extends Person {
    // 方法的重写：不满足需求时
    @Override // 重写方法建议添加该注释
    public void eat() {
        System.out.println("学生吃饭");
    }
    @Override
    public void drink() {
        System.out.println("学生喝奶茶");
    }
    public void lunch() {
        eat(); // 学生吃饭
        drink(); // 学生喝奶茶

        this.eat(); // 学生吃饭
        this.drink(); // 学生喝奶茶

        super.eat(); // 吃饭
        super.drink(); // 喝水
    }
}
