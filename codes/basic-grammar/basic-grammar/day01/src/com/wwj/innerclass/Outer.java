package com.wwj.innerclass;

public class Outer {
    private int age = 10;
    int a = 1;
    static int b = 2;

    // 成员内部类
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

    // 静态内部类
    static class Inner2 {
        public void show1() {
//            System.out.println(a); // error
            System.out.println(b); // ok
            /**
             * 静态内部类 只能访问外部类中的静态变量和静态方法
             *
             * 如果一定要访问【非静态属性】，则必须先创建实例，再调用实例的属性 / 方法
             */
            Outer o = new Outer();
            System.out.println(o.a);
            System.out.println("非静态方法被调用了");
        }

        public static void show2() {
            System.out.println("静态方法被调用了");
        }
    }

    public void show() {
        // 方法体中的局部变量
        int c = 10;
        // 局部内部类
        class Inner3 {
            public void method1() {
                System.out.println(a);
                System.out.println("局部内部类的method1方法");
            }

            public static void method2() {
                System.out.println("局部内部类的method2静态方法");
            }
        }

        Inner3 i = new Inner3();
        i.method1();
        Inner3.method2();
    }
}
