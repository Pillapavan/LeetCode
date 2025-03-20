package com.java.Math.Maths;

//Squroot purpose
public class NewtonRephson {
    public static void main(String[] args) {
        System.out.println(squRoot(40));
    }
    public static double squRoot(int n){
        double x=n;
        double root=0.0;
        while(true){
            root=0.5 *(x+(n /x));
            if(Math.abs(root-x)<0.5){
                break;
            }
            x=root;
        }
      return root;
    }
}
