package com.cstern.practice.objectbasic.objectwithclass;

/**
 * @author Ternence
 * @date 2023-03-25 20:21
 * @description
 * 用面向对象的思想模拟植物大战僵尸
 */
public class Demo02 {
    public static void main(String[] args) {
        Plants peaShooter = new Plants("peaShooter",1,1,10);
        Zombie nomalZombie =new Zombie("nomalZombie",2,1,10);
        peaShooter.zombie = nomalZombie;
        nomalZombie.plants = peaShooter;
        peaShooter.attack();
        nomalZombie.attack();
    }
}
class Plants {
    String name;
    int price;
    int damage;
    int hp;
    Zombie zombie;

    public Plants() {

    }
    public Plants(String name,int price,int damage,int hp) {
        this.name = name;
        this.price = price;
        this.damage = damage;
        this.hp = hp;
    }
    public void attack() {
        zombie.hp -= damage;
        System.out.println(name + " Attack！————" + zombie.name +" 还剩下" + zombie.hp + "滴血");
    }
}
class Zombie {
    String name;
    int damage;
    int walkSpeed;
    int hp;
    Plants plants;

    public Zombie() {

    }
    public Zombie(String name,int damage,int walkSpeed,int hp) {
        this.name = name;
        this.walkSpeed = walkSpeed;
        this.damage = damage;
        this.hp = hp;
    }
    public void attack() {
        plants.hp -= damage;
        System.out.println(name + " Attack！————" + plants.name +" 还剩下" + plants.hp + "滴血");
    }

}