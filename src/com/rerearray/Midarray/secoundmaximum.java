package com.rerearray.Midarray;

import com.rerearray.Arrayfiles;

import java.util.Arrays;

public class secoundmaximum {
    public static void main(String[] args) {
        Arrayfiles file = new Arrayfiles();
        file.getdata1();
        int[] array = file.firstarray;
        Arrays.sort(array);

        int max=0;
        for (int i=0;i<array.length-1;i++){
            int min=array[i];
            for (int j=0;j<array.length-1;j++){
                if (min<array[j]){
                    max=array[j];
                }
            }
        }
        System.out.println(max);


    }
}
