package com.wwj.innerclass;

public class Test2 {
    public static void main(String[] args) {
        printA(
                /**
                 * 匿名内部类：实现类只使用一次的场景
                 *
                 * 格式：
                 * new 类 / 接口() {
                 *      重写的方法
                 * }
                 *
                 * 可以写在成员位置 / 局部位置
                 */
                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("狗吃骨头");
                    }
                }
        );
    }

    public static void printA(Animal a) { // 多态
        a.eat(); // 编译看左边，运行看右边
    }
}
