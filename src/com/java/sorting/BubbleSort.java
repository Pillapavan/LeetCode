package com.java.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums={2,3,1,6,4};
        sorting(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void sorting(int[] nums){
        boolean swapped;
        for(int i=0;i<nums.length;i++){
            swapped=false;
            for(int j=1;j<nums.length-i;j++){
                if(nums[j]<nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                    swapped=true;
                }

            }
            if(!swapped){
                break;
            }
        }
    }
}
