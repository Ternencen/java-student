package com.csternence.day08;

/**
 * @author Ternence
 * @date 2023-03-28 19:25
 * @description
 * 问题1: 思考注释1下面的代码能否放开?会不会报错?
 *        可以放开，不会报错，因为执行到注释1下面的代码是已经创建了s对象
 * 问题2: 思考控制台输出的顺序,提供必要的文字说明解释代码为何如此执行。
 * 问题3: Homework building和Homework constructor会不会输出,为什么?
 *          不会输出，没有新建Demo03对象
*/
public class Demo03 {
    static Student01 s = new Student01(); // 2.静态成员变量赋值执行  7.new一个s对象
    {
        System.out.println("Homework building");
        s = null;
    }
    public static void main(String[] args) {  // 1.Demo03类加载执行
        System.out.println("main"); // 8.Demo03静态成员执行完毕 执行main方法
        // 注释1
        System.out.println(s.age);
        Person01 p = new Person01("刘备"); // 9.执行Person类加载过程 15.Person类加载完成，开始new对象 19.创建p对象完成
        System.out.println(p.name);
    }

    public Demo03() {
        System.out.println("Homework constructor");
    }
}
class Person01{
    {
        name = "赵云"; // 17.依顺序执行初始化过程
        System.out.println("Person building");
    }
    String name = "曹操";
    static Student01 s = new Student01();// 10.静态成员变量赋值执行 调用Student无参构造  14.创建s对象完毕

    public Person01() {
    }

    public Person01(String name) { // 16.调用一参构造方法
        System.out.println("Person constructor"); // 18.执行构造方法体
        this.name = name;
    }
}

class Student01 {
    int age = 10;// 4.显式赋值成员变量  11.显式赋值成员变量
    {
        System.out.println("Student01 building"); // 5.执行构造代码块内容 12.执行构造代码块
        age = 20;
    }

    public Student01(int age) {
        this.age = age;
    }

    public Student01(){  // 3.Student无静态成员，则Student调用无参构造，先进行初始化
        System.out.println("Student01 constructor"); // 6.执行无参构造方法 13.执行无参构造方法体
    }
}