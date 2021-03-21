package com.This.Time.Zoho.ArrayProgram.String.NumbersSng;

import java.util.Arrays;

public class setofnumberweights {

    public static void main(String[] args) {
        int[] weight = new int[]{10, 36, 54, 89, 12};
        int[] array = new int[weight.length];
        for (int i = 0; i < weight.length; i++) {
            boolean isperfect = findperfecrtsquare(array[i]);
            if (isperfect) {
                array[i] += 5;
            }
            boolean isMultipleby4and6 = isMultipleby4and(array[i]);
            if (isMultipleby4and6) {
                array[i] += 4;
            }
            boolean isevennumber = isevenNumbers(array[i]);
            if (isevennumber) {
                array[i] += 3;
            }


        }


        System.out.println("Array elements");
        System.out.println(Arrays.toString(weight));
        System.out.println("Arrays Weight");
        System.out.println(Arrays.toString(array));


    }

    private static boolean isevenNumbers(int n) {
        return n % 2 == 0;
    }

    private static boolean isMultipleby4and(int n) {
        return n % 4 == 0 && n % 6 == 0;
    }

    private static boolean findperfecrtsquare(int n) {
        for (int i = 1; i < n; i++) {
            if (i * i == n) {
                return true;
            }
        }

        return false;
    }
}
