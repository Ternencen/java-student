package com.cstern.practice.object_oriented.encapsulation;

/**
 * @author Ternence
 * @date 2023-03-28 14:27
 * @description
 */
public class Demo03 {
    public static void main(String[] args) {
        PrimaryStudent primaryStudent = new PrimaryStudent(666,888,"hello");
        System.out.println(primaryStudent.psVar);
    }
}
class Person {
    static {
        System.out.println("Person类加载");
    }
    {
        System.out.println("Person构造代码块");
    }
    public Person() {
        System.out.println("Person类的无参构造");
    }
}
class Student extends Person {
    static {
        System.out.println("Student类加载");
    }
    {
        System.out.println("Student构造代码块");
    }
    int sVar;
    String sVarString;
    public Student() {
        System.out.println("Student类无参构造");
    }
    public Student(int sVar) {
        // 在Java的任何构造器当中，如果第一行没有明确的去调用别的构造器
        // （通过this或super关键字）
        //那么第一行一定隐含了一条语句：super()
        System.out.println("Student int构造方法");
        this.sVar = sVar;
    }
    public Student(int sVar, String sVarString) {
        this(sVar);
        System.out.println("Student int String构造方法");
        this.sVarString = sVarString;
    }
}
class PrimaryStudent extends Student {
    static {
        System.out.println("PrimaryStudent类加载");
    }
    {
        System.out.println("PrimaryStudent构造代码块");
    }
    int psVar = 10;
    public PrimaryStudent(int psVar, int sVar, String sVarString) {
        super(sVar, sVarString);
        System.out.println("PrimaryStudent类的 三参构造");
        this.psVar = psVar = 100;
    }
}