package com.wwj.string;

public class CreateString {
    public static void main(String[] args) {
        String s1 = "hello";
        System.out.println(s1);

        String s2 = new String("world");
        System.out.println(s2);

        char[] chs = {'a', 'b', 'c'};
        String s3 = new String(chs);
        System.out.println(s3);

        // 应用场景：以后在网络中传输的字节信息需要转换为字符串，才能看懂
        byte[] bts = {66,68,70}; // ASCII码
        String s4 = new String(bts);
        System.out.println(s4);
    }
}
