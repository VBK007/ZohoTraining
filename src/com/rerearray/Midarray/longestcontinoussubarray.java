package com.rerearray.Midarray;

import com.rerearray.Arrayfiles;

public class longestcontinoussubarray {
    public static void main(String[] args) {
        Arrayfiles file = new Arrayfiles();
        file.getdata1();

        int start = 0;
        int beg = 0;
        int max_from_start = 0;
        int max_fro_end = 0;
        int end = 0;
        int[] array = file.firstarray;
        for (int i = 0; i < array.length; i++) {
           if (array[i]>max_fro_end+array[i]){
               start=i;
               max_fro_end=array[i];

           }else {
               max_fro_end=max_fro_end+array[i];
           }



            if (max_from_start < max_fro_end) {
                max_from_start = max_fro_end;

                end = i;

            }


        }

        System.out.println(" " + max_from_start);
        for (int i = start; i <= end; i++) {
            System.out.print(" " + array[i]);
        }

    }
}
