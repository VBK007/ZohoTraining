package com.rerearray.Stringreres;

import java.util.Scanner;

public class spiralprinting {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        printpatte(num);

    }

    public static void printpatte(int n) {
        int size = 2 * n - 1;
        int front = 0;
        int back = size - 1;
        int[][] pattern = new int[size][size];
        while (n != 0) {
            for (int i = front; i <= back; i++) {
                for (int j = front; j <= back; j++) {
                    if (i == front || i == back || j == front || j == back) {
                        pattern[i][j] = n;
                    }
                }
            }
            ++front;
            --back;
            --n;
        }


        for (int i = 0; i < pattern.length; i++) {
            for (int j = 0; j < pattern[i].length; j++) {
                System.out.print(pattern[i][j] + " ");
            }
            System.out.println();
        }

    }


}
