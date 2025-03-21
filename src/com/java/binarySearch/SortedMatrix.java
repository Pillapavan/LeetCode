package com.java.binarySearch;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(Arrays.toString(Search(matrix, 7)));
    }
    public static int[] BS(int[][] arr,int start, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;

            if (arr[start][mid] == target) {
                return new int[]{start,mid};
            } else if (arr[start][mid] < target) {
                cStart = mid + 1;

            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
    public static int[] Search(int[][] matrix,int target){
        int rows= matrix.length;
        int cols = matrix[0].length;

        if(cols==0){
            return new int[]{-1,-1};
        }
        if(rows==1){
            return BS(matrix,0,0,cols-1,target);
        }
        int rStart=0;
        int rEnd=rows-1;
        int cMid=cols/2;
        while(rStart<(rEnd-1)){
            int rMid=rStart+(rEnd-rStart)/2;
            if(matrix[rMid][cMid]==target){
                return new int[]{rMid,cMid};
            }else if(matrix[rMid][cMid]>target){
                rEnd=rMid;
            }else{
                rStart=rMid;
            }
        }
        if(matrix[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }
        if (matrix[rStart+1][cMid]==target) {
            return new int[]{rStart+1,cMid};
        }
        //4 cases
        if(target<=matrix[rStart][cMid-1]){
            return BS(matrix,rStart,0,cMid-1,target);
        }
        if(target>=matrix[rStart][cMid+1] && target<matrix[rStart][cols-1]){
            return BS(matrix,rStart,cMid+1,cols-1,target);
        }
        if(target<=matrix[rStart+1][cMid-1]){
            return BS(matrix,rEnd,0,cMid-1,target);
        }
        else{
            return BS(matrix,rEnd,cMid+1,cols-1,target);
        }
    }
}

