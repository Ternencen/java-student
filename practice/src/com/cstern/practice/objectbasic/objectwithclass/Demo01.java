package com.cstern.practice.objectbasic.objectwithclass;

/**
 * @author Ternence
 * @date 2023-03-25 10:47
 * @description
 * 1. 用面向对象的思想模拟LOL当中盖伦的战斗
 */
public class Demo01 {
    public static void main(String[] args) {
        Character character01 = new Character("gaylun","沉默","坚毅不倒", "转圈圈","大宝剑");
        character01.fight(character01.skillR);
    }
}
class Character {
    String name;
    String skillQ;
    String skillW;
    String skillE;
    String skillR;

    public Character() {

    }

    public Character(String name,String skillQ,String skillW,String skillE,String skillR) {
        this.name = name;
        this.skillQ = skillQ;
        this.skillW = skillW;
        this.skillE = skillE;
        this.skillR = skillR;
    }

    public void fight(String skill) {
        System.out.println(name + "使用了技能" + skill);
    }

}
