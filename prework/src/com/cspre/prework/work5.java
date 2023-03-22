package com.cspre.prework;

public class work5 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int count = 0;

        for(i = 101;i < 201;i++){
            for(j = 2;j < i;j++){
                if(i % j == 0) {
                    break;
                }
            }if(i ==j){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("共"+ count +"个素数");
    }
}
