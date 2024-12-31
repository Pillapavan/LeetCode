package com.java.binarySearch;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr ={2,3,4,7,7,7,7,8,8,10};
        int[] ans = {-1,-1};
        ans[0]=FirstAndlast(arr,7,true);
        if(ans[0]!=-1){
            ans[1]=FirstAndlast(arr,7,false);
        }
        System.out.println(Arrays.toString(ans));
    }
    public static int FirstAndlast(int[] arr,int target,boolean IsFirst) {
        int start = 0;
        int end = arr.length - 1;
        int ans=0;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (IsFirst) {
                  if (arr[mid] < target) {
                        start = mid + 1;
                    } else if(arr[mid]>target) {
                        end = mid - 1;
                    }else{
                      ans=mid;
                      end=mid-1;
                  }
                }else{
                     if (arr[mid] < target) {
                        start = mid + 1;
                    } else if(arr[mid]>target) {
                        end = mid - 1;
                    }else{
                         ans=mid;
                         start=mid+1;
                     }
                }
            }
        return ans;
    }
}
