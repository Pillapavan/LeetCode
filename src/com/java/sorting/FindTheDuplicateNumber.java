package com.java.sorting;

import java.util.Arrays;

//https://leetcode.com/problems/find-the-duplicate-number/
class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] nums={1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums) {
         int i=0;
         while(i<nums.length){
             int current=nums[i]-1;
             if(nums[i]!=i+1) {
                 if (nums[i] != nums[current]) {
                     swap(nums, i, current);
                 }else{
                     return nums[i];
                 }
             }else{
                 i++;
            }
         }
     return nums[i-1];
    }
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}