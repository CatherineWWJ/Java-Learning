package com.wwj;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    static ArrayList<User> list = new ArrayList<>();
    // 静态代码块：初始化一个账号信息
    static {
        list.add(new User("admin", "123456","421421202210244321", "13412345678"));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choose = null; // 用户选择的操作

        while (true) {
            System.out.println("------------欢迎来到本系统！------------");
            System.out.println("1:登录");
            System.out.println("2:注册");
            System.out.println("3:忘记密码");
            System.out.println("4.退出");
            System.out.println("请选择您的操作：");
            choose = sc.next();
            switch (choose) {
                case "1" -> login(list);
                case "2" -> register(list);
                case "3" -> forget(list);
                case "4" -> {
                    System.out.println("欢迎再次使用本系统！再见！");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    public static void login(ArrayList<User> list) {
        System.out.println("进入登录页面");
        Scanner sc = new Scanner(System.in);
        String username, password, code;
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            username = sc.next();
            int curIndex = getIndexByUsername(list, username);
            if (curIndex < 0) {
                System.out.println("该用户名尚未注册，请先注册再登录");
                return;
            }
            System.out.println("请输入密码：");
            password = sc.next();

            while (true) {
                String rightCode = getCode();
                System.out.println("当前正确的验证码为：" + rightCode);
                System.out.println("请输入验证码：");
                code = sc.next();
                if (code.equalsIgnoreCase(rightCode)) {
                    System.out.println("验证码输入正确");
                    break;
                } else {
                    System.out.println("验证码输入错误，请重新输入");
                }
            }

            if (!list.get(curIndex).getPassword().equals(password)) {
                System.out.println("登录失败");
                if (i == 2) {
                    System.out.println("当前账号" + username + "已被锁定，请联系管理员解锁");
                } else {
                    System.out.println("用户名或密码错误，还剩下" + (2 - i) + "次机会");
                }
            } else {
                System.out.println("登录成功！");
                StudentSystem ss = new StudentSystem();
                ss.startSystem();
                break;
            }
        }
    }

    // 随机生成验证码
    public static String getCode() {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char)('a' + i));
            list.add((char)('A' + i));
        }
        Random r = new Random();
        char[] codes = new char[5];
        for (int i = 0; i < 4; i++) {
            codes[i] = list.get(r.nextInt(list.size()));
        }
        codes[codes.length - 1] = (char)('0' + r.nextInt(10));
        int randomIndex = r.nextInt(codes.length);
        char temp = codes[randomIndex];
        codes[randomIndex] = codes[codes.length - 1];
        codes[codes.length - 1] = temp;
        return new String(codes);
    }

    public static void register(ArrayList<User> list) {
        System.out.println("进入注册页面");
        Scanner sc = new Scanner(System.in);
        String username, password, idCard, phone;
        while (true) {
            System.out.println("请输入用户名：");
            username = sc.next();
            if (checkUsername(list, username)) {
                System.out.println("注册的用户名符合要求");
                break;
            }
        }

        while (true) {
            System.out.println("请输入注册密码：");
            password = sc.next();
            System.out.println("请再次确认您输入的密码：");
            String again = sc.next();
            if (again.equals(password)) {
                System.out.println("密码确认无误");
                break;
            } else {
                System.out.println("两次输入的密码不一致，请重新输入");
            }
        }

        while (true) {
            System.out.println("请输入注册的身份证号：");
            idCard = sc.next();
            if (checkIdCard(idCard)) {
                System.out.println("注册的身份证号有效，符合要求");
                break;
            } else {
                System.out.println("注册的身份证号格式错误，请重新输入");
            }
        }

        while (true) {
            System.out.println("请输入注册的电话号码：");
            phone = sc.next();
            if (checkPhone(phone)) {
                System.out.println("注册的手机号码有效，符合要求");
                break;
            } else {
                System.out.println("手机号码格式有误，不符合要求，请重新输入");
            }
        }


        User u = new User(username, password, idCard, phone);
        list.add(u);
        System.out.println("用户注册成功！");

        System.out.println("下方表格展示的是所有已经注册的用户信息：");
        System.out.println("姓名\t密码\t\t身份证号\t\t\t\t电话号码\t\t\t");
        for (int i = 0; i < list.size(); i++) {
            User cur = list.get(i);
            System.out.println(cur.getUserName() + "\t" + cur.getPassword() + "\t" + cur.getIdCard() + "\t" + cur.getPhone() + "\t");
        }
    }

    // 校验电话号码的格式
    public static boolean checkPhone(String phone) {
        if (phone.length() != 11) {
            return false;
        }
        if (phone.startsWith("0")) {
            return false;
        }
        for (int i = 0; i < phone.length(); i++) {
            char c = phone.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    // 校验身份证号的格式
    public static boolean checkIdCard(String idCard) {
        if (idCard.length() != 18) {
            return false;
        }
        if (idCard.startsWith("0")) {
            return false;
        }
        char end = idCard.charAt(idCard.length() - 1);
        if (!((end >= '0' && end <= '9') || idCard.endsWith("x") || idCard.endsWith("X"))) {
            return false;
        }
        for (int i = 0; i < 17; i++) {
            char c = idCard.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    // 校验用户名是否符合要求
    public static boolean checkUsername(ArrayList<User> list, String name) {
        int len = name.length();
        if (len < 3 || len > 15) {
            System.out.println("用户名长度不符合要求");
            return false;
        }
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            // 不是小写字母、不是大写字母、不是数字
            if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < '0' || c > '9')) {
                System.out.println("用户名不是字母和数字的组合，不符合要求");
                return false;
            }
            if (c >= 'A') {
                count++;
            }
        }
        if (count <= 0) {
            System.out.println("用户名不能是纯数字，不符合要求");
            return false;
        }
        if (getIndexByUsername(list, name) >= 0) {
            System.out.println("该用户名已经存在，无法注册，请重新输入");
            return false;
        }
        return true;
    }

    // 在list中根据用户名查找，返回索引
    public static int getIndexByUsername(ArrayList<User> list, String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUserName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public static void forget(ArrayList<User> list) {
        System.out.println("进入忘记密码页面");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        int curIndex = getIndexByUsername(list, username);
        if (curIndex < 0) {
            System.out.println("该用户名未注册，请先注册");
            return;
        }
        System.out.println("请验证该用户的身份证号：");
        String idCard = sc.next();
        System.out.println("请验证该用户的手机号码：");
        String phone = sc.next();
        User current = list.get(curIndex);
        if (idCard.equals(current.getIdCard()) && phone.equals(current.getPhone())) {
            while (true) {
                System.out.println("请输入新密码：");
                String newPassword = sc.next();
                System.out.println("请再次确认新密码：");
                String again = sc.next();
                if (again.equals(newPassword)) {
                    current.setPassword(newPassword);
                    System.out.println("密码修改成功！");
                    break;
                } else {
                    System.out.println("两次输入的密码不一致，请重新输入");
                }
            }
        } else {
            System.out.println("账号信息不匹配，修改失败！");
        }
    }

    /*
    * 快捷键：自动创建方法（alt + enter）
    */
}
