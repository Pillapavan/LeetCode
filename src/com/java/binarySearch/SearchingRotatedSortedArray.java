package com.java.binarySearch;

public class SearchingRotatedSortedArray {
    public static void main(String[] args) {
         int[] arr={4,5,6,7,0,1,2};
        System.out.println(RBS(arr,1));
    }
    public static int RBS(int[] arr,int target) {
        int pivot = FindPivot(arr);
        if(pivot==-1){
            return BinarySearch(arr,target,0,arr.length-1);
        }
        if(arr[pivot]==target){
            return pivot;
        }
        if (target>arr[0]) {
            return BinarySearch(arr, target, 0, pivot-1);
        }

      return BinarySearch(arr, target, pivot+1, arr.length - 1);
    }
    public static int FindPivot(int[] arr){
        int start=0;
        int end =arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if (mid>start && arr[mid]<arr[mid-1]) {
                return mid-1;
            }
            if (arr[start]>arr[mid]) {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }

    //WITH duplicates
    public static int FindPivotWithDuplicates(int[] arr){
        int start=0;
        int end =arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if (mid>start && arr[mid]<arr[mid-1]) {
                return mid-1;
            }
            if(arr[start]==arr[mid] && arr[end]==arr[mid]){
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            else if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static int BinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
