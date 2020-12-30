package com.revise.Array.Mediumarray;

import com.revise.Array.Arrayfile;

import java.util.Arrays;

public class maximumsumcontiousarray {
    public static void main(String[] args) {
        Arrayfile file=new Arrayfile();
        file.getdata();

        int[] array=file.array;
        System.out.println("Enter the n value");
        int n=file.scanner.nextInt();
        for (int i=0;i<array.length;i++){
            for (int j=i+1;j< array.length;j++){
                if (array[i]+array[j]==n){
                    System.out.println("{ "+array[i]+" "+array[j]+" } ");
                }
                else if (array[i]==n){
                    System.out.println("{ "+array[i]+" } ");
                }

            }

        }


    }
}
