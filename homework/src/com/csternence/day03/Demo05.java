package com.csternence.day03;
/*
空指针异常
 */
public class Demo05 {
    public static void main(String[] args) {
        String[] str = null;
        System.out.println(str);

        // 访问数组元素
        // System.out.println(str[0]);
        // Exception in thread "main" java.lang.NullPointerException

        //避免空指针异常——>使用前判断
        if(str != null) {
            System.out.println(str[0]);
        }
    }
}
