package com.cspre.prework;

import java.util.Scanner;

public class Work31
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Fraction a = new Fraction(in.nextInt(), in.nextInt());
        Fraction b = new Fraction(in.nextInt(),in.nextInt());
        a.print();
        b.print();
        a.plus(b).print();
        a.multiply(b).plus(new Fraction(5,6)).print();
        a.print();
        b.print();
        in.close();
    }
}

class  Fraction
{
    //类中的成员变量最好都设置为private
    private int mol;//分子
    private  int den;//分母
    private double dou;//浮点数类型值
    public Fraction(int mol, int den)//构造函数
    {
        this.mol = mol;
        this.den = den;
    }
    public double toDouble()//将分数转换为double类型值
    {
        dou = mol/(double)den;
        return dou;
    }
    public int theDivisor(int a, int b)//返回a,b两个数的最大公约数
    {
        int num = 1;
        for(int i=2; i<=a && i<=b; i++)
        {
            if(a%i==0 && b%i==0)
                num = i;
        }
        return num;
    }
    public Fraction plus(Fraction r)//将自己的分数和r的分数相加，产生一个新的Fraction的对象
    {
        int mol_1 = this.mol;//为了不改变对象原始值，采用新增的变量来计算并返回值
        int den_1 = this.den;
        int mol_2 = r.mol;
        int den_2 = r.den;
        int ride_den, mol_result;//分别为两个分数相加之后分母、分子的最终值
        if(den_1 == den_2)
        {
            mol_result = mol_1 + mol_2;
            ride_den = den_1;
        }
        else if(den_2%den_1==0)
        {
            ride_den = den_2;
            mol_1 *= (den_2/den_1);
            mol_result = mol_1 + mol_2;
        }
        else if(den_1%den_2==0)
        {
            ride_den = den_1;
            mol_2 *= (den_1/den_2);
            mol_result = mol_1 + mol_2;
        }
        else
        {
            ride_den = den_1 * den_2;
            mol_1 *= den_2;
            mol_2 *= den_1;
            mol_result = mol_1 + mol_2;
        }
        return new Fraction(mol_result, ride_den);
    }
    public Fraction multiply(Fraction r)//将自己的分数和r的分数相乘
    {
        int mol_1 = this.mol;
        int den_1 = this.den;
        int mol_2 = r.mol;
        int den_2 = r.den;
        int mol_result = mol_1*mol_2;
        int den_result = den_1*den_2;
        //产生一个新的Fraction的对象
        return new Fraction(mol_result, den_result);//这样不会改变a对象中变量的值
    }

    public void print()//将自己以“分子/分母”的形式输出到标准输出
    {
        if(this.mol == this.den)//分子分母相等
            System.out.println(1);
        else if(theDivisor(mol,den) == 1)//没有最大公约数
            System.out.println(mol+"/"+den);
        else//有最大公约数进行约分
        {
            int divisor = theDivisor(mol,den);
            int mol_1 = mol, den_1 = den;
            mol_1 /= divisor;
            den_1 /= divisor;
            System.out.println(mol_1+"/"+den_1);
        }
    }
    public void printDouble()//打印变为double的值，本次作业没有用到
    {
        double toDouble = toDouble();
        System.out.println("double is: "+toDouble);
    }
}