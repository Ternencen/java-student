package com.cstern.practice.array;
/*
求不确定个数的int数值之和
注意事项：
1.调用方法时，如果有一个固定参数的方法匹配的同时，也可以与可变参数的方法匹配，则选择固定参数的方法
2.调用方法时，如果出现两个可变参数的方法都能匹配，则报错，这两个方法都无法调用了。
    注：一般来说要避免可变参数方法，发生方法重载，避免导致方法调用失效情况出现。
3.一个方法只能有一个可变长参数，并且这个可变长参数必须是该方法的最后一个参数。
 */
public class VariabLengthParameter {
    public static void main(String[] args) {
        System.out.println(sumInt(1,2,3,4,5));
    }
    public static int sumInt(int... a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
//    public static int sumInt(int a,int... b) {
//
//    }
}
