package com.csternence.day03;
/*
假如方法的返回值是一个数组（或者其它容器），而又有无返回数据的需求，这个时候普遍有两种做法

返回一个长度为0的数组（或者其它容器）
返回null

需求:
根据不同的情况,方法可能有两个结果,可能有一个结果,也可能没有结果
这时要返回容器,比如数组/集合
   要求:
       n>0 ---> 返回一个容器, 2个值
       n<0 -->  返回一个容器, 1个值
       n=0 ---> 返回容器, 没有值
    */
public class Demo06 {
    public static void main(String[] args) {

    }
    public static int[] test(int n) {
        int[] array ={};
        if(n > 0) {
            array = new int[] {1,2};
            return array;
        }
        if(n < 0) {
            array = new int[] {1};
            return array;
        }
        return array;
    }
}
