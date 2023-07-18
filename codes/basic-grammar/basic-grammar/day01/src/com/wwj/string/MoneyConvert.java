package com.wwj.string;

import java.util.Scanner;

// 将金额转换为大写字7位：数组按位插入单位
public class MoneyConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            money = sc.nextInt();
            if (money >=0 && money < 10000000) {
                break;
            } else {
                System.out.println("金额不合法！请重新输入。");
            }
        }
        String tran1 = numberToUpper(money);

        for (int i = tran1.length(); i < 7; i++) { // 补零
            tran1 = "零" + tran1; // 思考下为什么不用 += 号哦？？？分情况
        }

        char[] chs = {'佰','拾','万','仟','佰','拾','元'};

        String result = "";
        for (int i = 0; i < 7; i++) {
            result += tran1.charAt(i);
            result += chs[i];
        }
        System.out.println("最终转换后的金额为：" + result);
    }

    public static String numberToUpper(int money) {
        char[] chs = {'零','壹','贰','叁','肆','伍','陆','柒','捌','玖'};
        String result = "";
        while (money > 0) {
            result = chs[money%10] + result; // 这里可以返回字符串的常识顺序（让新得到的字符加在原来字符串左边）
            money /= 10;
        }
        return result;
    }
}
