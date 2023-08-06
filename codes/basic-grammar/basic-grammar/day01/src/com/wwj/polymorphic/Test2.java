package com.wwj.polymorphic;

public class Test2 {
    public static void main(String[] args) {
        // 创建对象（多态方式）
        Animal a = new Dog();
        // 调用成员变量：编译看左边，运行也看左边
        // 编译看左边：javac编译代码时，会看左边的父类中有没有这个变量。有：编译成功；没有：编译失败。
        // 运行看左边：java运行代码时，实际获取的就是左边父类中成员变量的值。
        System.out.println(a.name); // 动物

        // 调用成员方法：编译看左边，运行看右边
        // 编译看左边：javac编译代码时，会看左边的父类中有没有这个方法。有：编译成功；没有：编译失败。
        // 运行看右边：java运行代码时，实际上运行的子类中的方法。
        a.show(); // show --- 子类

        Animal a1 = new Dog();
        // 新特性：判断是否为Dog类型，是则强转，转换之后的变量名为d，不是则结果为false
        if (a1 instanceof Dog d) {
            d.lookHome();
        } else if (a1 instanceof Cat c) {
            c.catchMouse();
        } else {
            System.out.println("没有这种类型");
        }
    }
}

class Animal {
    String name = "动物";

    public void show() {
        System.out.println("show --- 父类");
    }
}

class Dog extends Animal {
    String name = "狗";

    @Override
    public void show() {
        System.out.println("show --- 子类：狗");
    }

    public void lookHome() {
        System.out.println("狗在看家");
    }
}

class Cat extends Animal {
    @Override
    public void show() {
        System.out.println("show --- 子类：猫");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
