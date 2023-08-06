package com.wwj.innerclass;

public class Outer {
    private int age = 10;

    class Inner {
        private int age = 20;
        String book = "java";

        public void show() {
            int age = 30;
            System.out.println(age); // 30

            System.out.println(this.age); // 20

            // Outer.this：获取外部类对象的地址值
            System.out.println(Outer.this.age); // 10
        }
    }

    static class Inner2 {
        public void show1() {
            System.out.println("非静态方法被调用了");
        }

        public static void show2() {
            System.out.println("静态方法被调用了");
        }
    }
}
