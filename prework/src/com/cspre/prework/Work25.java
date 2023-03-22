package com.cspre.prework;

public class Work25 {
    public static void main(String[] args) {
        double height = 56.7;
        double dayTime = 5;
        double night = 3.5;
        int day = 0;
        while(height > 0 ){
            day++;
            height -= dayTime;
            if(height <= 0){
                break;
            }else{
                height += night;
            }
        }
        System.out.println("蜗牛需要" + day + "天才能从井底爬出来");
    }
}
