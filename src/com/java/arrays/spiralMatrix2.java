package com.java.arrays;

import java.util.Arrays;

//https://leetcode.com/problems/spiral-matrix-ii/
public class spiralMatrix2 {
    public static void main(String[] args) {
        System.out.println(generateMatrix(3));

    }
    public static int[][] generateMatrix(int n) {
        if(n==1){
            return new int[][]{{1}};
        }
        int[][] nums=new int[n][n];
        int left=0;
        int right=nums[0].length;
        int top=0;
        int bottom=nums.length;
        int val =1;

        while(left<right && top<bottom){
            //top row
            for(int i=left;i<right;i++){
                nums[left][i]=val;
                val++;
            }
            top++;
            //last column
            for (int i = top; i < bottom; i++) {
                nums[i][right-1]=val;
                val++;
            }
            right--;

            //last row
            for (int i = right-1; i > left-1; i--) {
                nums[bottom-1][i]=val;
                val++;
            }
            bottom--;

            //first column
            for(int i=bottom-1;i>left;i--){
                nums[i][left]=val;
                val++;
            }
            left++;

        }


     return nums;
    }

}
