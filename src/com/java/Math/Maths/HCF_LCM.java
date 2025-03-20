package com.java.Math.Maths;

public class HCF_LCM {
    public static void main(String[] args) {
        System.out.println(Lcm(2,4));
    }

    // largest number that can divide two or more numbers
    public static int Hcf(int a,int b){
         if(a==0){
             return b;
         }
         return Hcf(b%a,a);
    }

    //The LCM of two or more numbers is the smallest positive integer that is divisible by all of the given numbers
    // smallest number divisible by both a & b
    public static int Lcm(int a,int b){
        return a*b/Hcf(a,b);
    }
}
