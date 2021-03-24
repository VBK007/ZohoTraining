package com.Tomorowzoho.First10String.Second10;

import java.util.Arrays;
import java.util.Scanner;

public class Insertafterk {
    public static void main(String[] args) {
        int[] array = new int[20];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array bits");
        for (int i = 0; i < 12; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(array));
        int number = 12;
        int k = 2;
        int count = 0;

        for (int i = 0; i < number; i++) {
            if (array[i] == 1) {
                count++;
            } else {
                count--;
            }

            if (count == k) {
                number++;
                for (int j = array.length - 1; j > i; j--) {
                    array[j] = array[j - 1];
                }
                array[i + 1] = 0;
            }



        }


        System.out.println(Arrays.toString(array));


    }
}
