package com.revise.Array.Hard;

import com.revise.Array.Arrayfile;

public class slidingwindow {
    public static void main(String[] args) {
        Arrayfile file = new Arrayfile();
        file.getdata();
        int[] array = file.array;
        System.out.println("Enter the window max size");
        int window = file.scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            int j;
            for (j = i; j < i + window; j++) {
                if (max < array[j]) {
                    max = array[j];
                }
            }


            System.out.print(" " + max);
            if (j== array.length){
                break;
            }

        }


    }
}
