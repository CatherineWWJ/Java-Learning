package com.wwj.interfacedemo;

public class Test {
    public static void main(String[] args) {
        Rabbit r = new Rabbit("小白", 1);
        System.out.println(r.getName() + ", " + r.getAge());
        r.eat();

        Dog d = new Dog("小黑", 2);
        System.out.println(d.getName() + ", " + d.getAge());
        d.eat();
        d.swim();
    }
}
