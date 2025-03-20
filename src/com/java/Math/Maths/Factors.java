package com.java.Math.Maths;

import java.util.ArrayList;
import java.util.List;

public class Factors {
    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();
        result=RecursionFactor1(7,1,result);
        if(result.size()<2){
            System.out.println(-1);
        }

        System.out.println(result.get(1));
    }
    public static void factor1(int n){
        for(int i=1;i<=n;i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void factor2(int n){
        ArrayList<Integer> result=new ArrayList<>();
        int squRoot=(int)Math.sqrt(n);
        for(int i=1;i<=squRoot;i++){
            if(n%i==0){
                System.out.println(i + " ");
                result.add(n/i);
            }
        }
        for(int j= result.size()-1;j>=0;j--){
            System.out.println(result.get(j)+ " ");
        }
    }

    //Recursion Type
    public static void RecursionFactor(int n,int i){
        if(i*i>n) {
            return;
        }
        if(i*i==n){
            System.out.println(i + " ");
        }else if(n%i==0){
            System.out.println(i+ " ");
            RecursionFactor(n,i+1);
            System.out.println(n/i + " ");
        }
        else{
            RecursionFactor(n,i+1);
        }
    }

    public static List<Integer> RecursionFactor1(int n, int i,List<Integer> result){
        if(i*i>n) {
            return result;
        }
        if(i*i==n){
            result.add(i);
           return result;
        }else if(n%i==0){
            result.add(i);
            RecursionFactor1(n,i+1,result);
            result.add(n/i);
        }
        else{
            RecursionFactor1(n,i+1,result);
        }
        return result;
    }
}
