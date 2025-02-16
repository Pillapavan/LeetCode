package com.java.patterns;

public class pattern {
    public static void main(String[] args) {
        pattern33(4);
    }

    public static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // output
//    * * * *
//    * * * *
//    * * * *
//    * * * *
    public static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
//    output
//    *
//    * *
//    * * *
//    * * * *
//    * * * * *

    public static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //    output
//    * * * * *
//    * * * *
//    * * *
//    * *
//    *
    public static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }
//           output
//            1
//            1 2
//            1 2 3
//            1 2 3 4

    public static void pattern5(int n) {
        for (int i = 1; i < 2 * n; i++) {
            int col = i >= n ? 2 * n - i : i;
            for (int j = 1; j <= col; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    //output
//*
//* *
//* * *
//* * * *
//* * * * *
//* * * *
//* * *
//* *
//*
    public static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            int spaces = n - i;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //output
//        *
//       **
//      ***
//     ****
//    *****
    public static void pattern7(int n) {
        for (int i = n; i >= 1; i--) {
            int spaces = n - i;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //    output
//    *****
//     ****
//      ***
//       **
//        *
    public static void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            int spaces = n - i;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            int count = 2 * i + 1;
            for (int k = 0; k < count; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //    output
//      *
//     ***
//    *****
//   *******
//  *********
    public static void pattern9(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            int count = (2 * n) - (2 * i + 1);
            for (int k = 0; k < count; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //      output
//    *********
//     *******
//      *****
//       ***
//        *
    public static void pattern10(int n) {
        for (int i = 1; i <= n; i++) {
            int spaces = n - i;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //    output
//     *
//    * *
//   * * *
//  * * * *
// * * * * *
    public static void pattern11(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //    output
//    * * * * *
//     * * * *
//      * * *
//       * *
//        *
    public static void pattern12(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            int spaces = i >= n ? (2 * n - 2) - i : i;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            int count = i >= n ? i - (n - 2) : n - i;
            for (int k = 0; k < count; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
//    * * * * *
//     * * * *
//      * * *
//       * *
//        *
//       * *
//      * * *
//     * * * *
//    * * * * *


    public static void pattern13(int n) {
        for (int i = 0; i < n; i++) {
            int spaces = n - i;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            int count = 2 * i + 1;
            for (int k = 0; k < count; k++) {
                if (k == 0 || k == count - 1 || 2 * n - 1 == count) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
//    output
//         *
//        * *
//       *   *
//      *     *
//     *********

    public static void pattern14(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            int count = 2 * n - (2 * i + 1);
            for (int k = 0; k < count; k++) {
                if (k == 0 || k == count - 1 || 2 * n - 1 == count) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
//      output
//    *********
//     *     *
//      *   *
//       * *
//        *

    public static void pattern15(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            int spaces = i >= n ? i - n + 1 : n - i - 1;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            int count = i >= n ? ((2 * n - 2) - i) * 2 + 1 : 2 * i + 1;
            for (int k = 0; k < count; k++) {
                if (k == 0 || k == count - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //       output
//         *
//        * *
//       *   *
//      *     *
//     *       *
//    *         *
//     *       *
//      *     *
//       *   *
//        * *
//         *
    public static void pattern16(int n) {
        int[] numbs = new int[n + 1];
        numbs[0] = 1;
        for (int i = 0; i < n; i++) {
            int spaces = n - i - 1;
            for (int j = 0; j < spaces; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print(numbs[k] + "   ");
            }
            for (int l = i + 1; l >= 1; l--) {
                numbs[l] = numbs[l] + numbs[l - 1];
            }
            System.out.println();
        }
    }
//       Pascal's Triangle
//          output
//            1
//          1   1
//        1   2   1
//      1   3   3   1
//    1   4   6   4   1

    public static void pattern17(int n) {
        for (int i = 1; i <= 2 * n; i++) {
            int col = i >= n ? 2 * n - i : i;
            for (int j = 0; j < n-col; j++) {
                System.out.print(" ");
            }
            for (int k = col; k >= 1; k--) {
                System.out.print(k);
            }
            for (int l = 2; l <= col; l++) {
                System.out.print(l);
            }

            System.out.println();
        }
    }

//    output
//     1
//    212
//   32123
//  4321234
//   32123
//    212
//     1

    public static void pattern18(int n) {
        for (int i = 0; i < 2 * n; i++) {
            int spaces = i >= n ? (2 * n - i - 1) * 2 : i * 2;
            int stars = i >= n ? i - n + 1 : n - i;
            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }
            for (int k = 0; k < spaces; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//    output
//    **********
//    ****  ****
//    ***    ***
//    **      **
//    *        *
//    *        *
//    **      **
//    ***    ***
//    ****  ****
//    **********

    public static void pattern19(int n){
        for (int i = 1; i < 2*n; i++) {
           int spaces=i>n?(2*i)-(2*n):(n-i)*2;
           int stars=i>n?2*n-i:i;
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < spaces; k++) {
                System.out.print(" ");
            }
            for (int l = 0; l < stars; l++) {
                System.out.print("*");
            }
          System.out.println();
        }
    }
//    output
//    *        *
//    **      **
//    ***    ***
//    ****  ****
//    **********
//    ****  ****
//    ***    ***
//    **      **
//    *        *
    public static void pattern20(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if(i==0 || i==n-1){
                    System.out.print("*");
                }else if(j==1 || j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
//   output
//    ****
//    *  *
//    *  *
//    *  *
//    ****

    public static void pattern21(int n) {
        int count=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (count > 9) {
                    System.out.print(count++ + " ");
                } else {
                    System.out.print(count++ + "  ");
                }
            }
            System.out.println();
        }
    }

//         output
//            1
//            2  3
//            4  5  6
//            7  8  9  10
//            11 12 13 14 15

    public static void pattern22(int n) {
        for (int i = 1; i <= n; i++) {
            int count=i%2;
            for (int j = 0; j < i; j++) {
                    System.out.print(count + " ");
                    count=1-count;
            }
            System.out.println();
        }
    }

//      output
//        1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1


    public static void pattern23(int n) {
        for (int i = 0; i < 2*n; i++) {
            for (int j = 0; j < 2*n; j++) {
                if((j==0 || j==2*n-1) || (i==j || i+j==2*n-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

//                 output
//                *        *
//                **      **
//                * *    * *
//                *  *  *  *
//                *   **   *
//                *   **   *
//                *  *  *  *
//                * *    * *
//                **      **
//                *        *

    public static void pattern24(int n) {
        for (int i = 0; i < n; i++) {
            int spaces=n-i-1;
            for(int k=0;k<spaces;k++){
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                if(i==0 || i==n-1){
                    System.out.print("*");
                }else if(j==0 || j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
//        output
//        *****
//       *   *
//      *   *
//     *   *
//    *****


    public static void pattern25(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(i+1 + " ");
            }
            System.out.println();
        }
    }
//    output
//    1 1 1 1 1 1
//    2 2 2 2 2
//    3 3 3 3
//    4 4 4
//    5 5
//    6

    public static void pattern26(int n){
        int count=1;
        int secondCount=n*n+1;
        for (int i = n; i >0; i--) {
            for(int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                if(count<=9) {
                    System.out.print(count++ + " ");
                }else{
                    System.out.print(count++);
                }
            }
            System.out.print("  ");
            for (int j = 0; j < i; j++) {
                System.out.print(secondCount + " ");
                secondCount++;
            }
            secondCount-=2*i-1 ;
            System.out.println();
        }
    }
//           output
//    1 2 3 4   17 18 19 20
//      5 6 7   14 15 16
//        8 9   12 13
//          10  11

    public static void pattern27(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            int spaces = i >= n ? i-n+1 : n-i-1;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            int count = i >= n ? (2*n-2)-i+1 : i+1;
            for (int k = 0; k < count; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
//      output
//        *
//       * *
//      * * *
//     * * * *
//    * * * * *
//     * * * *
//      * * *
//       * *
//        *

    public static void pattern28(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l + " ");
            }

            System.out.println();
        }
    }
//          ouput
//            1
//          2 1 2
//        3 2 1 2 3
//      4 3 2 1 2 3 4
//    5 4 3 2 1 2 3 4 5

    public static void pattern29(int n){
        for(int row=0;row<2*n-1;row++){
            for (int col = 0; col < 2*n-1; col++) {
                int count=n-Math.min(Math.min(col,(2*n-1)-(col+1)),Math.min(row,(2*n-1)-(row+1)));
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
//       output
//    4 4 4 4 4 4 4
//    4 3 3 3 3 3 4
//    4 3 2 2 2 3 4
//    4 3 2 1 2 3 4
//    4 3 2 2 2 3 4
//    4 3 3 3 3 3 4
//    4 4 4 4 4 4 4

    public static void pattern30(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                int count=j==i?n-1:(n-i+j)-1;
                System.out.print((char)('A'+count)+ " ");
            }
            System.out.println();
        }
    }
//  output
//    E
//    D E
//    C D E
//    B C D E
//    A B C D E

    public static void pattern31(int n){
        char character=97;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(character + " ");
                character= (char) (character>='a'?(character-'a')+'A'+1:(character-'A')+'a'+1);
            }
            System.out.println();
        }
    }
//  output
//    a
//    B c
//    D e F
//    g H i J
//    k L m N o

    public static void pattern32(int n){
        for (int i = 0; i <n; i++) {
            for (int j = i; j < n; j++) {
                int count=(n-j)-1;
                System.out.print((char)('A'+count)+ " ");
            }
            System.out.println();
        }
    }
//     output
//    E D C B A
//    D C B A
//    C B A
//    B A
//    A


    public static void pattern33(int n){
        for (int i = 1; i <= n; i++) {
            int spaces=(n-i)*2;
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = 0; k < spaces; k++) {
                System.out.print(" ");
            }
            for (int l = i; l >0; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
//         output
//        1      1
//        12    21
//        123  321
//        12344321






}