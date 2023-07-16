package com.wwj.practice;

import java.util.Scanner;

// 评委打分：6个评委，去掉最高分、最低分，求平均分
public class JudgeMark {
    public static void main(String[] args) {
        int[] scores = getScores();
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }

        int maxS = getMax(scores);
        int minS = getMin(scores);
        int sumS = getSum(scores);

        int avg = (sumS - maxS - minS) / (scores.length - 2);
        System.out.println("最后的得分为：" + avg + "分");
    }

    public static int getSum(int[] scores) { // 求总分
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum;
    }

    public static int getMin(int[] scores) { // 求最低分
        int min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (min > scores[i]) min = scores[i];
        }
        return min;
    }

    public static int getMax(int[] scores) { // 求最高分
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (max < scores[i]) max = scores[i];
        }
        return max;
    }

    public static int[] getScores() { // 评委进行打分
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; ) {
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                i++; // 仔细思考为什么要把代码写在这里？合法才修改变量
            }
        }
        return scores;
    }
}
