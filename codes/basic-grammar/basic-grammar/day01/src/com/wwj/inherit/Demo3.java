package com.wwj.inherit;

// 继承中构造方法的访问顺序：在访问子类构造方法之前，先访问父类的构造方法，初始化父类的数据空间
public class Demo3 {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = new Cat("dundun", 8);
    }
}

class Animal {
    String name;
    int age;

    public Animal() {
        System.out.println("进入父类的无参构造方法");
    }

    public Animal(String name, int age) {
        System.out.println("进入父类的带参构造方法");
        this.name = name;
        this.age = age;
    }
}

class Cat extends Animal {
    public Cat() {
        super();
        System.out.println("进入子类的无参构造方法");
    }

    public Cat(String name, int age) {
        super(name, age);
        System.out.println("进入子类的带参构造方法");
    }
}
