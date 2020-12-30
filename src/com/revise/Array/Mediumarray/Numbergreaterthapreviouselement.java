package com.revise.Array.Mediumarray;

import com.revise.Array.Arrayfile;

import java.util.Arrays;

public class Numbergreaterthapreviouselement {
    public static void main(String[] args) {
        Arrayfile file = new Arrayfile();
        file.getdata();
        int[] array = file.array;
        System.out.print(array[0]);
        int flag = 1;
        for (int i = 1; i < array.length; i++) {

            if (flag==1){
                if (array[i]>0){
                    if (array[i]>array[i-1]){
                        System.out.print(" "+array[i]);
                    }
                    else {
                        flag=0;
                    }

                }

            }
        }


    }
}
