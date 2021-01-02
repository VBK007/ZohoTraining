package com.rerearray.Stringreres;

import java.util.Arrays;
import java.util.Scanner;

public class horizontalequaltoverix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array1 = new int[][]{{0, 1, 0}, {0, 0, 0}, {0, 1, 0}};
        int[][] array2 = new int[][]{{0, 1, 0}, {1, 0, 0}, {0, 1, 0}};
        int row = array1.length;
        int col = array1[0].length;
        System.out.println("Array1");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(Arrays.toString(array1[i]));
        }
        System.out.println("Array2 ");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(Arrays.toString(array2[i]));
        }
        ishoritozaltequal(array1, row, col, array2);


    }

    private static void ishoritozaltequal(int[][] arr, int n, int m, int[][] array2) {
        boolean horizontal = true;
        boolean vertical = true;

        for (int i=0,k=n-1;i<n/2;i++,k--){
            for (int j=0;j<m;j++){
                if (arr[i][j]!=arr[k][j]){
                    horizontal=false;
                    break;
                }
                else if (arr[i][j]==arr[k][j]){
                    if (arr[i][j]!=array2[i][j]||arr[i][j]!=array2[k][j]){
                        horizontal=false;
                        break;
                    }
                }

            }
        }

        for (int i=0,k=m-1;i<m/2;i++,k--){
            for (int j=0;j<n;j++){
                if (arr[i][j]!=arr[k][j]){
                    vertical=false;
                    break;
                }
                else if (arr[i][j]==arr[k][j]){
                    if (arr[i][j]!=array2[i][j]||arr[i][j]!=array2[k][j]){
                        vertical=false;
                        break;
                    }
                }
            }
        }
        if (!horizontal && !vertical)
            System.out.println("NO");

        else if (horizontal && !vertical)
            System.out.println("HORIZONTAL");

        else if (vertical && !horizontal)
            System.out.println("VERTICAL");

        else
            System.out.println("BOTH");


    }

}
