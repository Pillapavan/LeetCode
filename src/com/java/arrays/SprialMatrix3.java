package com.java.arrays;

//https://leetcode.com/problems/spiral-matrix-iii/

public class SprialMatrix3 {
    public static void main(String[] args) {
        System.out.print(spiralMatrixIII(5,6,1,4));
    }
    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] matrix=new int[rows*cols][2];
        int count = 0;
        matrix[count++]= new int[]{rStart, cStart};
        int[] directions={0,1,0,-1,0};
        int d=0;
        int steps=0;
        while(count<rows*cols) {
            if (d == 0 || d == 2) {
                steps++;
            }
            for (int i = 0; i < steps; i++) {
                rStart += directions[d];
                cStart += directions[d + 1];
                if (rStart >= 0 && rStart < rows && cStart < cols && cStart >= 0) {
                    matrix[count++] = new int[]{rStart, cStart};
                }
                if (count == rows * cols) {
                    return matrix;
                }
            }

            d = ++d % 4;

        }
     return matrix;
    }
}
