package com.java.binarySearch;

public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr={2,4,6,7,9,10,33,44,55,66};
        System.out.println(OrderAgnosticBinary(arr,10));
    }
    public static int OrderAgnosticBinary(int[] arr,int target){
        int start=0;
        int end = arr.length-1;

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
