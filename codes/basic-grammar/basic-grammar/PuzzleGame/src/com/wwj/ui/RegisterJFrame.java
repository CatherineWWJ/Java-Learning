package com.wwj.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {
    public RegisterJFrame() {
        this.setSize(488, 500);
        this.setTitle("拼图 注册");
        // 设置界面置顶
        this.setAlwaysOnTop(true);
        // 设置界面居中
        this.setLocationRelativeTo(null);
        /**
         * 设置关闭模式
         * 具体数字代表的意思可以看源码
         * 2：当所有界面都关掉的时候，才关掉虚拟机（所有界面均需做此设置）
         *
         * 3：关掉任意一个页面时，就关掉虚拟机
         */
//        this.setDefaultCloseOperation(3);
        // 另一种写法：
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
