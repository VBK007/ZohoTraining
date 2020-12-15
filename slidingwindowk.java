package Cryptography;

import java.util.Scanner;

public class slidingwindowk {

    public static void main(String[] args) {
        System.out.println("Enter the array size");
        Scanner scanner = new Scanner(System.in);
        int arraysize = scanner.nextInt();
        int[] array = new int[arraysize];
        System.out.println("Enter the arrray data one by one");
        for (int i = 0; i < arraysize; i++) {
            array[i] = scanner.nextInt();

        }
        System.out.println("Enter the K v alue window size");
        int k = scanner.nextInt();


        System.out.println();
        System.out.println("Before Swapping");

        for (int i = 0; i < arraysize; i++) {
            System.out.print(" | " + array[i]);
        }
        System.out.println();
        System.out.println("After swapping");

        for (int i = 0; i < arraysize; i++) {
            int max = array[i];
            int j;
            for (j = i; j < k; j++) {
                if (j < arraysize) {
                    if (array[j] > max) {
                        max = array[j];
                    }
                }
            }
            if (j<=arraysize){
                if (max != 0) {
                    System.out.print(" " + max);
                }

                k++;
            }

           else {
               break;
            }


        }


        System.out.println();
//
//        System.out.println("After swapping");
//        for (int i=0;i<arraysize;i++){
//            System.out.print(" | "+array[i]);
//        }


    }


}
