package com.revise.Array.Mediumarray;

import com.revise.Array.Arrayfile;

import java.util.Arrays;

public class numberpresentinfibinoseries {
    public static void main(String[] args) {
        Arrayfile file=new Arrayfile();
        file.getdata();

        int[] array=file.array;
        int[] fibino=new int[20];
        int n1=0,n2=1,n3;

        fibino[0]=n1;
        fibino[1]=n2;

        for (int i=2;i<fibino.length;i++){
            n3=n1+n2;
            fibino[i]=n3;

            n1=n2;
            n2=n3;

        }
        System.out.println("Your String "+Arrays.toString(array));
        System.out.println("fibino elements ");
        System.out.println(Arrays.toString(fibino));
        for (int i=0;i< array.length;i++){
            for (int j=0;j< fibino.length;j++){
                if (array[i]== fibino[j]){
                    System.out.print(" | "+array[i]);
                }
            }
        }

    }
}
