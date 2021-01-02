package com.rerearray.Stringreres;

import java.util.Arrays;

public class rotateandequal {
    public static void main(String[] args) {
        int[][] matrix1 = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int[][] matrix2 = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int row = matrix1.length;
        int col = matrix1[0].length;
        for (int i = 0; i < matrix1.length; i++) {
            System.out.println(Arrays.toString(matrix1[i]));
        }
        System.out.println();
        boolean res = rotamtrix90(matrix1, row, col);
        boolean re = rotamtrix180(matrix1, row, col);


    }

    private static boolean rotamtrix180(int[][] matrix1, int row, int col) {
        rotaematix(matrix1, row, col);
System.out.println();
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
        return true;
    }

    private static void rotaematix(int[][] matrix1, int row, int col) {
        traversematix(matrix1, row, col);
        revesecolum(matrix1, row, col);
        traversematix(matrix1, row, col);
        revesecolum(matrix1, row, col);


    }

    private static void revesecolum(int[][] matrix1, int row, int col) {
     for (int i=0;i<col;i++){
         for (int j=0,k=col-1;j<k;j++,k--){
             int t=matrix1[j][i];
             matrix1[j][i]=matrix1[k][i];
             matrix1[k][i]=t;
         }
     }

    }

    private static void traversematix(int[][] matrix1, int row, int col) {

        for (int i=0;i<row;i++){
            for (int j=i;j<col;j++){
                int t=matrix1[i][j];
                matrix1[i][j]=matrix1[j][i];
                matrix1[j][i]=t;
            }
        }
    }


    private static boolean rotamtrix90(int[][] matrix1, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = i; j < col - 1 - i; j++) {
                int t = matrix1[i][j];
                matrix1[i][j] = matrix1[col - 1 - j][i];
                matrix1[col - 1 - j][i] = matrix1[col - 1 - i][col - 1 - j];
                matrix1[col - 1 - i][col - 1 - j] = matrix1[j][col - 1 - i];
                matrix1[j][col - 1 - i] = t;
            }
        }
        for (int i = 0; i < matrix1.length; i++) {
            System.out.println(Arrays.toString(matrix1[i]));

        }

        return true;
    }


}
