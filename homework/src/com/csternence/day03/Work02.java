package com.csternence.day03;
/*
数组基本使用练习
现在你去参加歌唱比赛。有10个评委打分，规则是去掉最高分和最低分，求平均分是最终成绩。请编码计算出你的最终成绩~
注：
请合理使用方法，不要胡子眉毛一把抓把代码全部写在main方法里。
最高分和最低分可能有多个，但只需要去掉其中一个即可（也就是说平均成绩要除以8）
建议给出下面的三个方法：
求数组中元素最大值的方法
求数组中元素最小值的方法
求数组中元素平均分的方法
 */
public class Work02 {
    public static void main(String[] args) {
        double[] singScore = {1,1,1,2,2,3,4,5,6,7};
        double highestScore = getHighest(singScore);
        double lowestScore = getLowest(singScore);
        int countHighest = 1;
        int countLowest = 1;
        for (int i = 0; i < singScore.length; i++) {
            if(singScore[i] == highestScore && countHighest == 1) {
                singScore[i] = 0;
                countHighest--;
            }
            if(singScore[i] == lowestScore && countLowest == 1) {
                singScore[i] = 0;
                countLowest--;
            }
        }
        System.out.println("最终成绩是：" + getAverage(singScore));
    }
    // 求数组中元素最大值
    public static double getHighest(double[] a) {
        double highestScore = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i] > highestScore) {
                highestScore = a[i];
            }
        }
        return highestScore;
    }
    // 求数组中元素最小值
    public static double getLowest(double[] a) {
        double lowestScore = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i] < lowestScore) {
                lowestScore = a[i];
            }
        }
        return lowestScore;
    }
    // 求数组中元素平均分
    public static double getAverage(double[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum / 10;
    }
}
