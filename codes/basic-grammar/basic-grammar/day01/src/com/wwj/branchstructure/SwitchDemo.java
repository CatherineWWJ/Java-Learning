package com.wwj.branchstructure;

public class SwitchDemo {
    public static void main(String[] args) {
        int noodles = 3;
        switch (noodles) { // 表达式取值为byte short int char，jdk5以后增加枚举，jdk7以后增加String
            case 1: // case后面的值只能是字面量，不可以是变量！
                System.out.println("重庆小面");
                break;
            case 2:
                System.out.println("武汉热干面");
                break;
            case 3:
                System.out.println("北京炸酱面");
                break;
            case 4:
                System.out.println("兰州拉面");
                break;
            default:
                System.out.println("泡面");
                break;
        }

        int week = 5;
        switch (week) {
            case 1,2,3,4,5: // case可以多个匹配
                System.out.println("工作日");
                break;
            case 6,7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("不合法");
                break;
        }
    }
}
