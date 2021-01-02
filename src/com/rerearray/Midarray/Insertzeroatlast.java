package com.rerearray.Midarray;

import com.rerearray.Arrayfiles;

import java.util.Arrays;

public class Insertzeroatlast {
    public static void main(String[] args) {
        Arrayfiles file=new Arrayfiles();
        file.getdata1();
        int[] array=file.firstarray;
        int count=0;

        for (int i=0;i< array.length;i++){
            if (array[i]!=0){
                   array[count++]=array[i];
            }

        }

        for (int i=count;i<array.length;i++){
            array[i]=0;
        }

        System.out.println(Arrays.toString(array));





    }
}
