package com.java.sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] nums={1,3,4,2,2};
        CyclicSorting(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void CyclicSorting(int[] nums){
         int i=0;
         while(i<nums.length){
             int current=nums[i]-1;
             if(nums[i]!=nums[current]) {
                 swap(nums, i, current);
             }else{
                 i++;
             }
         }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
