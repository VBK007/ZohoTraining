package com.company.String;

import java.util.Arrays;
import java.util.Scanner;

public class maximumpossibelkgitnumber {
    static String str = "";
    static int mainmax = 0;
    static int minmax = 0;
    static String ji = "";

    public static void main(String[] args) {
        System.out.println("Enter the array size");
        Scanner scanner = new Scanner(System.in);
        int arraysize = scanner.nextInt();
        int[] array = new int[arraysize];
        System.out.println("Enter the array elements one  ");
        for (int i = 0; i < arraysize; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter the digit");
        int digit = scanner.nextInt();
        System.out.println("Your Array Elements are");
        System.out.println(Arrays.toString(array));
        System.out.println();


        String firstelemnt = "";
        for (int i = arraysize-1; i >0; i--) {
            firstelemnt += array[i];


            for (int j = arraysize-1; j >0; j--) {
                ji += array[j];
                str = firstelemnt;

                str += ji;

                if (str.length() == digit) {
                    minmax = Integer.parseInt(str);
                    if (minmax > mainmax) {
                        mainmax = minmax;
                    }
                    str = " ";
                    ji = "";

                } else if (str.length() > digit) {
                    str = " ";
                    ji="";
                }

                if (j == arraysize - 1) {
                    str = "";
                    ji = "";
                    firstelemnt = "";
                }


            }
        }


        System.out.println("The greatest posibilities number is " + " " + mainmax);


    }

}
