package com.Revise.String;

import java.util.Arrays;
import java.util.Scanner;

public class duplicateelementmatrix {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the matrix");
        int row = scanner.nextInt();
        System.out.println("Enter the column");
        int col = scanner.nextInt();
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }


        System.out.println("After swapping");

        for (int i=0;i<row;i++){
            int count=0;
            for (int j=0;j<i;j++){
                count=1;
                for (int k=0;k<col;k++){
                    if (matrix[i][k]!=matrix[j][k]){
                       count=0;
                    }
                }
                if (count==1){
                    break;
                }
            }


           if (count==0){
               for (int j=0;j<col;j++){
                   System.out.print(matrix[i][j]);
               }
           }
           System.out.println();
        }




    }
}
