package Cryptography;

import java.util.Scanner;

public class Comparetwoarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size");
        int arraysize = scanner.nextInt();


        System.out.println("Enter the array data one by one");
        int[] array = new int[arraysize];

        for (int i = 0; i < arraysize; i++) {
            array[i] = scanner.nextInt();
        }
        int min = 0;
        int max = 0;
        for (int i = 0; i < arraysize; i++) {
            min = array[i];
            for (int j = 0; j < arraysize; j++) {
                max = array[j];
                if (max > min) {
                    for (int k = 0; k < arraysize; k++) {
                        if (array[k] > min && array[k] < max) {

                            max = array[k];


                        }

                    }

                }


            }


            if (min != max) {
                System.out.print(" " + min + " > " + " " + max + " , ");
            } else {
                System.out.print(" " + min + " > ");
            }

        }


    }
}
