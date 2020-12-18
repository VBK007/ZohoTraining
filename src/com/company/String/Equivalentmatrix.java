package com.company.String;

import java.util.Arrays;
import java.util.Scanner;

public class Equivalentmatrix {
    public static void main(String[] args) {
        System.out.println("Enter the Row size");
        Scanner scanner=new Scanner(System.in);
        int row=scanner.nextInt();

        System.out.println("Enter the Colum Size");
        int colum=scanner.nextInt();
        int[][] array=new int[row][colum];

        System.out.println("Enter the array data one by one");
        for (int i=0;i<row;i++){
            for (int j=0;j<colum;j++){
                array[i][j]=scanner.nextInt();
            }
        }
for (int i=0;i<array.length;i++)
        System.out.println(Arrays.toString(array[i]));


System.out.println("After swapping");
for (int i=0;i<row;i++){
    for (int j=0;j<array[0].length;j++){


    }
}



    }
}
