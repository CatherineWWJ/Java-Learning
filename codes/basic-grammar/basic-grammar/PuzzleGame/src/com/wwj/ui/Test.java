package com.wwj.ui;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        /**
         * JFrame可以理解为一个JavaBean类
         */
        // 游戏的主界面
        JFrame home = new JFrame();
        home.setSize(603, 680);
        home.setVisible(true);

        // 登录界面
        JFrame login = new JFrame();
        login.setSize(488, 430);
        login.setVisible(true);

        // 注册界面
        JFrame register = new JFrame();
        register.setSize(488, 500);
        register.setVisible(true);
    }
}
