package com.rerearray.Stringreres;

import java.util.Arrays;
import java.util.Scanner;

public class rotatematrix90degree {

    public static void main(String[] args) {
        System.out.println("Enter the matix size");
        Scanner scanner = new Scanner(System.in);
        int arraysize = scanner.nextInt();
        int[][] array = new int[arraysize][arraysize];

        for (int i = 0; i < arraysize; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("Simple method");

        for (int j = 0; j < array.length; j++) {
            for (int i = array.length - 1; i >= 0; i--)
                System.out.print(array[i][j] + " ");

            System.out.println();

        }

        print90degree(array);


    }

    private static void print90degree(int[][] array) {
        int n = array.length;
        for (int i = 0; i < array.length / 2; i++) {

            for (int j = i; j < array.length - i - 1; j++) {

                int temp = array[i][j];
                array[i][j] = array[n - 1 - j][i];
                array[n - 1 - j][i] = array[n - 1 - i][n - 1 - j];
                array[n - 1 - i][n - 1 - j] = array[j][n - 1 - i];
                array[j][n - 1 - i] = temp;

            }

        }
        System.out.println("After Swapping original array");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }


        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int temp=array[j][n-1-i];
                array[j][n-1-i]=array[n-1-i][n-1-j];
                array[n-1-i][n-1-j]=array[n-1-j][i];
                array[n-1-j][i]=temp;

            }
        }
        System.out.println("After Swapping original array");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }


    }


}
