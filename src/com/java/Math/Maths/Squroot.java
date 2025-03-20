package com.java.Math.Maths;

public class Squroot {
    public static void main(String[] args) {
         int n=90;
         int p=3;
        System.out.printf("%.3f", SquareRoot(n,p));
    }
    public static double SquareRoot(int n,int p){
        int start=0;
        int end=n;
        double root=0.0;
        while(start<end){
            int mid=start+(end-start)/2;
            if(mid*mid==n){
                return n;
            }else if(mid*mid>n){
                end=mid-1;
                root=end;
            }else{
                start=mid+1;
            }
        }
      double incre=0.1;
        for(int i=0;i<p;i++){
            while(root*root<n){
                root+=incre;
            }
            root-=incre;
            incre/=10;
        }
     return root;
    }
}
