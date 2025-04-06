package com.java.binarySearch;
//https://leetcode.com/problems/find-peak-element/
public class FindPeakIndex {
    public static void main(String[] args) {
        int[] arr={1,3,6,6,6,6,7,4,3,2,1};
        System.out.println(findPeakElementWithDuplicates(arr));
    }
    static int findPeakElement(int[] arr){
        int start=0;
        int end = arr.length-1;
        while(start<end){
            int mid= start+(end-start)/2;
            if(arr[mid]>arr[mid+1]) {
                end=mid;
            }else{
                start=mid+1;
            }
        }
     return start;
    }

    static int findPeakElementWithDuplicates(int[] arr){
        int start=0;
        int end= arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            int pMid=mid;
            while(pMid<end-1 && arr[pMid]==arr[pMid+1]){
                pMid++;
            }
            if(start!=end-1 && pMid==end-1){
                end=mid;
            }
            else if(arr[pMid]>arr[pMid+1]){
                end=pMid;
            }else{
                start=mid+1;
            }
        }
       return arr[start];
    }

}
