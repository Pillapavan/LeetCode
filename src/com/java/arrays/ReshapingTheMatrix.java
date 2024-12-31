package com.java.arrays;

import java.util.Arrays;
//https://leetcode.com/problems/reshape-the-matrix/description/
public class ReshapingTheMatrix {
    public static void main(String[] args) {
//       int[][] mat={{1,2},{3,4}};
//        System.out.println(Arrays.deepToString(matrixReshape(mat, 1, 4)));
        int[] arr={2,5,1,3,4,7};
        System.out.println(shuffle(arr,3));
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] Matrix=new int[r][c];
        int count=0;
        if(r*c != mat.length*mat[0].length){
            return mat;
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                Matrix[count/c][count%c]=mat[i][j];
                count++;
            }
        }

        return Matrix;
    }

    public static int[] shuffle(int[] nums, int n) {
        int length =2*n;
        int[] arr = new int[length];
        arr[0]=nums[0];
        arr[1]=nums[n];
        int step=1;
        for(int i=2;i<length;i++){
            if(i%2==0){
                arr[i]=nums[step++];
            }else{
                arr[i]=nums[++n];
            }
        }
        return arr;
    }
}
