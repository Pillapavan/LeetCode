package com.java.binarySearch;

public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr={3,5,9,14,16,18,22,44,65,76};
        System.out.println(floor(arr,2));
    }
    public static int ceiling(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        if(target>arr[end]){
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start];
    }

    public static int floor(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        if(target<arr[start]){
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[end];
    }


}
