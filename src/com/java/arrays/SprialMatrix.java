package com.java.arrays;
//https://leetcode.com/problems/spiral-matrix/description/atana

import java.util.ArrayList;
import java.util.List;

public class SprialMatrix {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arr = new ArrayList<>();
        int left=0;
        int right=matrix[0].length;
        int top=0;
        int bottom=matrix.length;

        while(left<right && top < bottom){
            //top row
            for(int i=left;i<right;i++){
                arr.add(matrix[top][i]);
            }
            top++;
            //last column
            for(int i=top;i<bottom;i++){
                arr.add(matrix[i][right-1]);
            }
            right--;
            if(left<right && top<bottom){
                for(int i = right-1;i>left-1;i--){
                    arr.add(matrix[bottom-1][i]);
                }
                bottom--;
                for (int i = bottom-1; i > left; i--) {
                    arr.add(matrix[i][left]);
                }
                left++;
            }else{
                break;
            }
        }
      return arr;
    }
}
