package com.java.binarySearch;

import java.util.Arrays;

public class FindPeakElementInMatrix {
    public static void main(String[] args) {
         int[][] mat={{41,8,2,48,18},{16,15,9,7,44},{48,35,6,38,28},{3,2,14,15,33},{39,36,13,46,42}};
        System.out.println(Arrays.toString(findPeakGrid(mat)));
    }
    public static int[] findPeakGrid(int[][] mat) {
        int rows=mat.length;
        int cols=mat[0].length;
        int start=0;
        int end=cols-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int midMax=findMaxIndex(mat,rows,mid);
            int leftEle=mid-1>=0 ? mat[midMax][mid-1] : -1;
            int rightEle=mid+1<cols ?mat[midMax][mid+1] : -1;
            if(leftEle<mat[midMax][mid] && rightEle < mat[midMax][mid]){
                return new int[]{midMax,mid};
            }else if(leftEle>mat[midMax][mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }

        return new int[]{-1,-1};
    }
    public static int findMaxIndex(int[][] mat,int rows,int mid){
        int maxVal=-1;
        int index=-1;
        for(int i=0;i<rows;i++){
            if(mat[i][mid]>maxVal){
                maxVal=mat[i][mid];
                index=i;
            }
        }
        return index;
    }
}
