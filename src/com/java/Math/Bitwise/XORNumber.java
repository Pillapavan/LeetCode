package com.java.Math.Bitwise;

public class XORNumber {
    public static void main(String[] args) {
        int a=3;
        int b=9;
        System.out.println(range(b)^range(a-1));
    }
    public static int range(int a){
        if(a%4==0) return a;
        if(a%4==1) return 1;
        if(a%4==2) return a+1;
     return 0;
    }
}
