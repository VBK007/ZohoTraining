package com.rerearray.Midarray;

import com.rerearray.Arrayfiles;

import java.util.Arrays;

public class PRODUCTEXPECTSELF {
    public static void main(String[] args) {
        Arrayfiles file=new Arrayfiles();
        file.getdata1();
        int[] array=file.firstarray;
        int[] product=new int[array.length];

        for (int i=0;i<array.length;i++){
            int producted=1;
            for (int j=0;j<array.length;j++){
                if (i!=j){
                   producted*=array[j];
                }
            }

            product[i]=producted;
        }

        System.out.println(Arrays.toString(product));
    }
}
