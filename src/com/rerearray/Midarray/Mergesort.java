package com.rerearray.Midarray;

import com.rerearray.Arrayfiles;

import java.util.Arrays;

public class Mergesort {
    public static void main(String[] args) {
        Arrayfiles file = new Arrayfiles();
        file.getdata();

        int[] firstarray = file.firstarray;
        int[] secarray = file.secoundarray;
        int[] duplicate = new int[firstarray.length + secarray.length];

        int j = 0;
        int index = 0;
        while (index < firstarray.length) {
            duplicate[j++] = firstarray[index];
            index++;
        }

        index = 0;
        while (index < secarray.length) {
            duplicate[j++] = secarray[index];
            index++;
        }
        Arrays.sort(duplicate);
        System.out.println(Arrays.toString(duplicate));


        int[] temp = new int[duplicate.length];
        j = 0;

        for (int i = 0; i < duplicate.length - 1; i++) {
            if (duplicate[i] != duplicate[i + 1]) {
                temp[j++] = duplicate[i];
            }

        }

        temp[j++] = duplicate[duplicate.length - 1];

        for (int i = 0; i < j; i++) {
            duplicate[i] = temp[i];
        }


        for (int i = 0; i < j; i++) {
            System.out.print(" | " + duplicate[i]);
        }


    }
}
