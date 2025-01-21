package com.java.sorting;

class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums={3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
    }
    public static int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            int current=nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[current]){
                swap(nums,i,current);
            }else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                return j+1;
            }
        }
     return nums.length+1;
    }
      public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}