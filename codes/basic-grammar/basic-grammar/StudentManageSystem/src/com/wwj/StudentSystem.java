package com.wwj;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    // 定义用户选择的常量
    private static final int ADD_STUDENT = 1;
    private static final int DEL_STUDENT = 2;
    private static final int UPDATE_STUDENT = 3;
    private static final int QUERY_STUDENT = 4;
    private static final int EXIT = 5;
    public static void startSystem() {
        Scanner sc = new Scanner(System.in);
        int choose; // 用户选择

        ArrayList<Student> list = new ArrayList<>(); // 存放学生信息的集合

        // 给循环起标号
        loop: while (true) {
            printTools();
            choose = sc.nextInt();
            switch (choose) {
                case ADD_STUDENT -> addStudent(list);
                case DEL_STUDENT -> delStudent(list);
                case UPDATE_STUDENT -> updateStudent(list);
                case QUERY_STUDENT -> queryStudent(list);
                case EXIT -> {
                    System.out.println("欢迎再次使用本系统！再见！");
                    break loop;
//                    System.exit(0); // 停止虚拟机运行
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    // 判断id是否在学生信息中已经存在，存在的话返回具体的索引，否则返回-1
    public static int isExit(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getId())) {
                return i;
            }
        }
        return -1;
    }

    public static void addStudent(ArrayList<Student> list) {
        System.out.println("添加学生信息");
        Scanner sc = new Scanner(System.in);
        String id, name, address;
        int age;
        while (true) {
            System.out.println("请输入ID：");
            id = sc.next();
            if (isExit(list, id) >= 0) {
                System.out.println("当前的ID已经存在，抱歉无法添加！");
                continue;
            }
            System.out.println("请输入姓名：");
            name = sc.next();
            System.out.println("请输入年龄：");
            age = sc.nextInt();
            System.out.println("请输入地址：");
            address = sc.next();
            Student stu = new Student(id, name, age, address);
            list.add(stu);
            break;
        }
        System.out.println("学生信息添加成功！");
    }

    public static void delStudent(ArrayList<Student> list) {
        System.out.println("删除学生信息");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生ID：");
        String id = sc.next();
        int findIndex = isExit(list, id);
        if (findIndex >= 0) {
            list.remove(findIndex);
            System.out.println("删除学生信息成功！");
        } else {
            System.out.println("不存在该学生，删除失败！");
        }
    }

    public static void updateStudent(ArrayList<Student> list) {
        System.out.println("修改学生信息");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要修改的学生ID：");
        String id = sc.next();
        int findIndex = isExit(list, id);
        if (findIndex >= 0) {
            Student s = list.get(findIndex);
            System.out.println("请输入修改后的姓名：");
            s.setName(sc.next());
            System.out.println("请输入修改后的年龄：");
            s.setAge(sc.nextInt());
            System.out.println("请输入修改后的地址：");
            s.setAddress(sc.next());
            System.out.println("ID为" + id + "的学生信息修改成功！");
        } else {
            System.out.println("不存在该学生，修改失败！");
        }
    }

    public static void queryStudent(ArrayList<Student> list) {
        System.out.println("查看所有学生信息");
        if (list.size() > 0) {
            System.out.printf("ID\t\t姓名\t年龄\t地址\t");
            System.out.println();
            for (int i = 0; i < list.size(); i++) {
                Student s = list.get(i);
                System.out.printf("%s\t\t%s\t%d\t%s\t", s.getId(), s.getName(), s.getAge(), s.getAddress());
                System.out.println();
            }
        } else {
            System.out.println("学生信息为空！");
        }
    }

    public static void printTools() {
        System.out.println("---------------欢迎来到学生管理系统---------------");
        System.out.println("1:添加学生");
        System.out.println("2:删除学生");
        System.out.println("3:修改学生");
        System.out.println("4:查询学生");
        System.out.println("5:退出");
        System.out.println("请输入您的选择：");
    }
}
