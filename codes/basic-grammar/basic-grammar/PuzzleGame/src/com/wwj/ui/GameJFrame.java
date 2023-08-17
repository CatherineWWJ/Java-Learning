package com.wwj.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    public GameJFrame() {
        initJFrame();

        initJMenuBar();

        this.setVisible(true);
    }

    private void initJMenuBar() {
        // 初始化菜单
        JMenuBar jMenuBar = new JMenuBar();

        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem accountItem = new JMenuItem("公众号");

        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        // 给整个页面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        this.setSize(603, 680);
        this.setTitle("拼图单机版 v1.0");
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
    }
}
