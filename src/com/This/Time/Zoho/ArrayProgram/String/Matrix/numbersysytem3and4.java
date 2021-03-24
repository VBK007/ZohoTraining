package com.This.Time.Zoho.ArrayProgram.String.Matrix;

import java.util.Arrays;

public class numbersysytem3and4 {
    public static void main(String[] args) {
        int[] array=new int[20];
        int n=5;

        array[0]=3;
        array[1]=4;

        int k=1;

        for (int i=0;i<n;i++){
            array[++k]=(array[i]*10)+3;
            array[++k]=(array[i]*10)+4 ;

        }


        System.out.println(Arrays.toString(array));


    }
}
