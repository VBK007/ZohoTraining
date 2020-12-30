package com.rerearray.Haed;

import com.rerearray.Arrayfiles;

import java.util.Arrays;

public class Altosort {

    public static void main(String[] args) {
        Arrayfiles file = new Arrayfiles();
        file.getdata1();
        int[] array = file.firstarray;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }


        int s1 = array.length / 2;
        int s2 = array.length - 1;

        for (int i = 0; i <s1; i++) {

            if (s1 % 2 == 1) {
                if (i == s1-1) {
                    System.out.print(array[i]+" , " + array[s1]);

                } else {
                    System.out.print(array[s2] + " ," + array[i] + " , ");
                    s2--;
                }

            }

            else {
                System.out.print(array[s2] + " ," + array[i]+" , ");
                s2--;
            }


        }


    }


}
