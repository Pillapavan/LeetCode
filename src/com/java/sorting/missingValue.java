package com.java.sorting;
//https://leetcode.com/problems/missing-number/description/
class missingValue {
    public static void main(String[] args) {
        int[] nums={4,2,0,1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
         int i=0;
         while(i<nums.length){
             if(nums[i]<nums.length && nums[i]!=nums[nums[i]]) {
                 swap(nums, i, nums[i]);
             }else{
                 i++;
             }
         }
         for(int j=0;j<nums.length;j++){
            if(nums[j] != j){
                return j;
            }
        } 
     return nums.length;      
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}