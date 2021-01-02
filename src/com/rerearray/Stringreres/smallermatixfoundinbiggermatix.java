package com.rerearray.Stringreres;

import java.util.Arrays;
import java.util.Scanner;

public class smallermatixfoundinbiggermatix {
    public static void main(String[] args) {
        System.out.println("Enter the matix size");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[][] matrix = new int[number][number];
        System.out.println("Enter the secound matix size");
        int size = scanner.nextInt();
        int[][] submatix = new int[size][size];
        System.out.println("Enter the array data for matix one");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the Secound matix data");
        for (int i = 0; i < submatix.length; i++) {
            for (int j = 0; j < submatix.length; j++) {
                submatix[i][j] = scanner.nextInt();
            }
        }

        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        System.out.println();
        for (int i = 0; i < submatix.length; i++) {
            System.out.println(Arrays.toString(submatix[i]));
        }

        loopX: for (int x = 0; x < matrix.length - submatix.length + 1; ++x)
            loopY: for (int y = 0; y < matrix[x].length - submatix[0].length + 1; ++y)
            {
                for (int xx = 0; xx < submatix.length; ++xx)
                    for (int yy = 0; yy < submatix[0].length; ++yy)
                    {
                        if (matrix[x + xx][y + yy] != submatix[xx][yy])
                        {
                            continue loopY;
                        }
                    }


                System.out.println("Found at: " + x + " " + y);
                break loopX;
            }
        System.out.println("Done");
    }
}
