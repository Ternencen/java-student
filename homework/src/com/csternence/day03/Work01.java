package com.csternence.day03;

import java.util.Arrays;

/*
数组基础练习——除以首元素
定义一个double类型的数组，让数组中每个元素（包括首位元素）都除以首位元素，得到的结果过作为该位置上的新元素。
例如数组[ 2.0 , 4.0 , 6.0 , 4.0 ] 经过方法运算得到新数组 [ 1.0 ,2.0 , 3.0 ,2.0 ]
注：
思考能不能直接在原先数组上完成，思考方法的返回值类型写什么。
注意元素取值的变化。
 */
public class Work01 {
    public static void main(String[] args) {
        double[] a = {2.0,4.0,6.0,4.0};
        divideFirstElement(a);
        System.out.println(Arrays.toString(a));
    }
    public static void divideFirstElement(double[] a) {
        double firstElement = a[0];
        for (int i = 0; i < a.length; i++) {
            a[i] /= firstElement;
        }
    }
}
