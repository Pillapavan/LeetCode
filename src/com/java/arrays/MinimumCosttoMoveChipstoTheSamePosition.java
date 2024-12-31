package com.java.arrays;
//https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/description/

//position[i] + 2 or position[i] - 2 with cost = 0.
//position[i] + 1 or position[i] - 1 with cost = 1.
public class MinimumCosttoMoveChipstoTheSamePosition {
    public static void main(String[] args) {
        int[] position={2,10000};
        System.out.println(minCostToMoveChips(position));
    }
    public static int minCostToMoveChips(int[] position) {
       int even = 0,odd=0;
        for (int i = 0; i < position.length; i++) {
            if(i%2==0){
                even+=1;
            }else{
                odd+=1;
            }
        }
      return Math.min(even, odd);
    }

}
