package com.cstern.practice.objectbasic.code_block;

/**
 * @author Ternence
 * @date 2023-03-26 15:01
 * @description
 * 静态变量——静态初始化块——变量——初始化块——构造器
 */
public class Demo02 {
    /* 静态变量 */
    public static String staticField = "静态变量";
    /* 变量 */
    public String field = "变量";
    /* 静态初始化块 */
    static {
        System.out.println( staticField );
        System.out.println( "静态初始化块" );
    }
    /* 初始化块 */
    {
        System.out.println( field );
        System.out.println( "初始化块" );
    }
    /* 构造器 */
    public Demo02()
    {
        System.out.println( "构造器" );
    }


    public static void main( String[] args )
    {
        new Demo02();
    }
}
