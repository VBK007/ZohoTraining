package com.revise.Array.Mediumarray;

import com.revise.Array.Arrayfile;

public class alternativesorted {
    public static void main(String[] args) {
        Arrayfile file = new Arrayfile();
        file.getdata();
        int[] array = file.array;
        int max = 0, min = 0;
        for (int i = 0; i < array.length; i++) {
            min = array[i];

            for (int j = 0; j < array.length; j++) {
                max = array[j];
                if (max > min) {

                    for (int k = 0; k < array.length; k++) {
                        if (array[k] > min && array[k] < max) {
                            max = array[k];
                            break;
                        }
                    }

                }

            }

            if (min != max) {
                System.out.print(" " + min + " > " + max + ", ");
            } else {
                System.out.print(" " + min + " > ");
            }


        }

    }
}
