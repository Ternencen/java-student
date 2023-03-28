package com.cstern.practice.objectbasic.keywords_static;

/**
 * @author Ternence
 * @date 2023-03-26 10:51
 * @description
 * 场景如下:
 * 一场篮球比赛, 梦之队有5名顶级球员Kobe, James, Stephen...... 都是神射手擅长投3分,投篮必进
 * 每进一球, 队伍分数+3, 比赛结束, 统计一下该队伍得分情况,  写程序模拟这个场景.
 * 思路:
 * - main里面定义int count, 用来记录分数
 * - 每当有1个球员进球, 分数+3
 */
public class Demo04 {
    public static void main(String[] args) {
        BasketballPlayer kobe = new BasketballPlayer("Kobe");
        BasketballPlayer james = new BasketballPlayer("James");
        BasketballPlayer stephen = new BasketballPlayer("Stephen");
        kobe.shoot();
        System.out.println("梦之队分数为：" + BasketballPlayer.count);
        james.shoot();
        System.out.println("梦之队分数为：" + james.count);
        stephen.shoot();
        System.out.println("梦之队分数为：" + kobe.count);
        BasketballPlayer.count = 15;
        System.out.println(BasketballPlayer.count);
        test();
    }
    public static void test() {
        System.out.println("hahahha");
    }
}
class BasketballPlayer {
    String name;
    int threePoints = 3;
    // 定义一个静态成员变量 分数 同成员变量一样具有默认初值
    // 访问推荐通过 类名. 的方式 当然也可通过对象名. 的方式访问（不推荐）
    // 静态成员变量（类变量或类属性）为所有对象共享
    public static int count;

    // 无参构造
    public BasketballPlayer() {

    }
    // 有参构造
    public BasketballPlayer(String name) {
        this.name = name;
    }
    // 投篮行为
    // 普通成员方法可调用静态或非静态方法
    public void shoot() {
        System.out.println(this.name + "投出了三分球，队伍获得" + this.threePoints);
        count += this.threePoints;
        celebrate();
    }
    public static void celebrate() {
        System.out.println("类中用非静态方法调用静态方法");
        //test02();
    }
    public void test02() {
        System.out.println("类中用静态方法调用非静态方法");
    }
}

