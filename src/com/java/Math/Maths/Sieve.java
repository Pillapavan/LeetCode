package com.java.Math.Maths;

public class Sieve {
    public static void main(String[] args) {
       int n=20;
       boolean[] primes=new boolean[n+1];
       sieve(n,primes);
    }

    // Time complexity o(N * log(log N ))
    //False is Prime And True is Not Prime
    public static void sieve(int n,boolean[] primes){
        for(int i=2;i*i<=n;i++){
            if(!primes[i]){
                for (int j=i*2;j<=n;j+=i){
                    primes[j]=true;
                }
            }
        }
        for (int k=2;k< primes.length;k++){
            if(!primes[k]){
                System.out.print(k + " ");
            }
        }
    }
}
