package com.java.binarySearch;
//find the position of target in a infinite sorted array
public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 8, 10, 13, 25};
        System.out.println(ans(arr, 8));
    }

    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int NewStart = end + 1;
            // end=end+sizeofBox*2
            end = end + (end - start + 1) * 2;
            start = NewStart;
        }
        return BinarySearch(arr, target, start, end);
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