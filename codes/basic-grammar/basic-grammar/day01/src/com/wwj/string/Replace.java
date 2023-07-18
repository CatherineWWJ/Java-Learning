package com.wwj.string;

// 替换敏感词
public class Replace {
    public static void main(String[] args) {
        String s = "你TMD真的很烦人";
        String s_ = s.replace("TMD", "***");
        System.out.println(s_);
    }
}
