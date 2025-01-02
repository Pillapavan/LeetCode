package com.java.binarySearch;

import java.util.Arrays;

//https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
public class CapacityToShipPackagesWithinDDays {
    public static void main(String[] args) {
        int[] weights={1,2,3,4,5,6,7,8,9,10};
        System.out.println(shipWithinDays(weights,5));
    }
    public static int shipWithinDays(int[] weights, int days) {
        int start =  Arrays.stream(weights).max().getAsInt();;
        int end= Arrays.stream(weights).sum();
        int capacity=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            int ReqDays =findDays(weights,mid,days);
            if(ReqDays<=days){
                capacity=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
     return capacity;
    }
    public static int findDays(int[] weights,int capacity,int days){
        int reqDays = 1;
        int Load=0;
        for (int i = 0; i <= weights.length-1; i++) {
            if(Load+weights[i] > capacity){
                reqDays++;
                Load=weights[i];
            }else{
                Load+=weights[i];
            }
        }
     return reqDays;
    }
}
