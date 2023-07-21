package com.wwj.inherit;

// 访问成员变量：就近原则（方法体 > 本类的成员变量 > 父类的成员变量）按序查找
public class Demo1 {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.ziShow();
    }
}

class Fu {
    String name = "Fu";
    String hobby = "Sing";
}

class Zi extends Fu {
    String name = "Zi";

    public void ziShow() {
        String name = "ziShow";
        System.out.println(name); // ziShow
        System.out.println(this.name); // Zi
        System.out.println(super.name); // Fu

        System.out.println(hobby); // Sing
    }
}
