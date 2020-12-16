package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Alternativelysort {


    public static void main(String[] args) {
        System.out.println("Enter the array size");
        Scanner scanner = new Scanner(System.in);

        int arraysize = scanner.nextInt();
        int[] array = new int[arraysize];

        System.out.println("Enter the array elements one by one");
        for (int i = 0; i < arraysize; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Before Swapping");
        for (int i = 0; i < arraysize; i++) {
            System.out.print(" | " + array[i]);
        }


        Arrays.sort(array);
        System.out.println();

        int s1 = array.length;
        int s2 = array.length - 1;

        for (int i = 0; i < s1 / 2; i++) {
            if (s1 % 2 == 1) {
                System.out.print(" " + array[s2] + " " + array[i]);
                s2--;


                if (i == (s1 / 2) - 1) {
                    System.out.print(" " + array[s1 / 2]);
                }
            } else {
                System.out.print(" " + array[s2] + " " + array[i]);
                s2--;
            }


        }
    }
}
