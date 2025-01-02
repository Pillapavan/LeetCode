package com.java.binarySearch;

public class SplitTheArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        System.out.println(splitArray(nums,1));
    }
    public static int splitArray(int[] nums, int k) {
        int start=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]);
            end+=nums[i];
        }
        int ans=0;
        while(start<end){
            int mid=start+(end-start)/2;
            if(findpieces(nums,mid,k)){
                ans=mid;
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
    public static boolean findpieces(int[] nums,int max,int k){
        int sum=0;
        int pieces=1;
        for (int num:nums) {
            if(num>max){return false;}
            if(sum+num > max){
                pieces++;
                sum=num;
                if(pieces>k){return false;}
            }else{
                sum+=num;
            }
        }
        return true;
    }
}
