package com.java.sorting;

import java.util.ArrayList;
import java.util.List;

class FindAllNumbersDisappearedInArray {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
         int i=0;
          while(i<nums.length){
             int current=nums[i]-1;
             if(nums[i]!=nums[current]) {
                 swap(nums, i, current);
             }else{
                 i++;
             }
         }
         ArrayList<Integer> List=new ArrayList<Integer>();
         for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                List.add(j+1);
            }
         }
      return List;
    }
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}