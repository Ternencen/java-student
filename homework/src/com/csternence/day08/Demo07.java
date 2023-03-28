package com.csternence.day08;

/**
 * @author Ternence
 * @date 2023-03-28 20:52
 * @description 设计一个员工类(Staff)，要求该类：
 * 属性: 姓名,性别,工号,工资
 * 构造器:
 * 姓名的单参构造器、姓名和性别的双参构造器、姓名、性别和工资的三参构造器
 * 其中员工的工号要求(每一位员工都必须有工号):
 * 第一个员工对象的工号是10001
 * 第二个员工对象的工号是10002
 * 第三个员工对象的工号是10003
 * ....
 * 现在每位员工都要缴纳一个固定额的公积金（比如2000），要求在员工类中设计一个方法求员工的到手工资。（除了扣除这个固定额度的公积金，不考虑诸如扣税等其余问题）
 * 最后再定义一个方法用于打印员工对象的各种属性取值，其中在打印工资时，要打印实际到手工资。
 * 将该类定义完毕后，尝试创建对象，测试一下代码。
 */
public class Demo07 {
    public static void main(String[] args) {
        Staff number01 = new Staff("zs", "18", 15000);
        Staff number02 = new Staff("ls", "25", 13000);
        number01.printInformation();
        number02.printInformation();
    }
}

class Staff {
    String name;
    String gender;
    int id;
    double salary;
    private static int count = 10000;

    {
        count++;
        id = count;
    }

    public Staff(String name) {
        this.name = name;
    }

    public Staff(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public Staff(String name, String gender, double salary) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    // 求员工到手工资
    public double finalSalary() {
        salary -= 2000;
        return salary;
    }

    // 打印员工对象的各种属性值
    public void printInformation() {
        System.out.println("姓名" + name + "性别" + gender + "工号" + id + "工资" + finalSalary());
    }
}
