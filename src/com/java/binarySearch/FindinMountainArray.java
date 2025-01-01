package com.java.binarySearch;
//https://leetcode.com/problems/find-in-mountain-array/description/
public class FindinMountainArray {
    public static void main(String[] args) {
          int[] arr={1,2,4,5,3,1};
        System.out.println(MountainArray(arr,3));
    }
    public static int MountainArray(int[] arr,int target){
        int Peak= findPeakElement(arr);
        int res=BinarySearch(arr,target,0,Peak);
        if(res!=-1){
            return res;
        }
        return BinarySearch(arr,target,Peak+1,arr.length-1);
    }

    public static int findPeakElement(int[] arr){
        int start=0;
        int end = arr.length-1;
        while(start<end){
            int mid= start+(end-start)/2;
            if (arr[mid]>arr[mid+1]) {
                end=mid;
            }else{
               start=mid+1;
            }
        }
        return start;
    }
    public static int BinarySearch(int[] arr,int target,int start,int end){

        //Checking if the is ascending are descending
        boolean isAsc=arr[start]<arr[end];

        while(start<=end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
