package com.wwj.innerclass;

public class Test {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        System.out.println(oi.book);

        oi.show();

        /**
         * 记住：只要是静态的东西，都可以用 类名点 直接获取
         */
        Outer.Inner2 oi2 = new Outer.Inner2();
        oi2.show1();
        // 静态方法
        Outer.Inner2.show2();

        Outer o = new Outer();
        o.show();
    }
}
