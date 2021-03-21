package com.This.Time.Zoho.ArrayProgram.String.Matrix;

import java.util.Arrays;

public class nmmatrixzeroblock1block {
    public static void main(String[] args) {
        char[][] matrix=new char[][]{{'1','1','0','0'},
                 {'1','0','0','1'},{'1','1','1','1'},{'0','0','0','1'}};


        printpatitern(matrix);

      for (int i=0;i<matrix.length;i++){
         for (int j=0;j<matrix[0].length;j++){
             System.out.print(matrix[i][j] +" " );
         }
         System.out.println();
      }


    }

    private static void printpatitern(char[][] matrix) {
        char c='-';
        for (int i=0;i<matrix.length;i++){

            for (int j=0;j<matrix[0].length;j++){
                if (j==0){
                    if (matrix[i][j]!='0'){
                        matrix[i][j]=c;
                    }
                }
                 if (i==matrix.length-1&&j== matrix[0].length-1){
                    matrix[i][j]=matrix[i][j]==0?0:c;
                }
                if (j>0){
                    for (int k=j+1;k<matrix[0].length;k++){

                        if (matrix[i][j]=='1'&&matrix[i][k]=='1') {
                            matrix[i][j] = c;

                            if (j == matrix[0].length - 2) {
                                matrix[i][matrix[0].length - 1] = c;
                            }
                        }
                    }
                }


            }
        }

    }
}
