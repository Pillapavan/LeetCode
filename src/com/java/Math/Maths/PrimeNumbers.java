package com.java.Math.Maths;

public class PrimeNumbers {
    public static void main(String[] args) {
        for(int i=2;i<20;i++){
            System.out.println(i +" " + Prime2(i));
        }
    }

    //Brute force
    public static void Prime1(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println(n + " not prime");
                return;
            }
        }
        System.out.println(n + " Prime");
    }


    //Optimal  Approach
    public static boolean Prime2(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
