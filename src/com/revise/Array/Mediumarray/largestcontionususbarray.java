package com.revise.Array.Mediumarray;

import com.revise.Array.Arrayfile;

import java.util.Arrays;

public class largestcontionususbarray {
    public static void main(String[] args) {
        Arrayfile file=new Arrayfile();
        file.getdata();
int[] array=file.array;
System.out.println(Arrays.toString(array));
        int size = array.length;
        int start = 0;
        int end = 0;



    int maxSoFar = 0, maxEndingHere = 0;

    for (int i = 0; i < size; i++) {
        if (array[i] > maxEndingHere + array[i]) {
            start = i;
            maxEndingHere = array[i];
        } else
            maxEndingHere = maxEndingHere + array[i];

        if (maxSoFar < maxEndingHere) {
            maxSoFar = maxEndingHere;
            end = i;
        }
    }





System.out.println(maxSoFar);
for (int i=start;i<=end;i++){
    System.out.print(" "+array[i]);
}





    }
}
