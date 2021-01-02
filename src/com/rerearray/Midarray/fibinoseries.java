package com.rerearray.Midarray;

import com.rerearray.Arrayfiles;

import java.util.Arrays;

public class fibinoseries {
    public static void main(String[] args) {
        Arrayfiles file=new Arrayfiles();
        file.getdata1();
        int[] fibino=new int[25];
        int[] array=file.firstarray;
        int n1=0,n2=1,n3;
        fibino[0]=n1;
        fibino[1]=n2;
        for (int i=2;i<fibino.length;i++){
            n3=n1+n2;
            fibino[i]=n3;
            n1=n2;
            n2=n3;
        }


        System.out.println(Arrays.toString(fibino));

        for (int i=0;i< array.length;i++){
            for (int j=0;j< fibino.length-1;j++){
                if (array[i]==fibino[j]){
                    System.out.print(" "+array[i]);
                    break;
                }

            }
        }



    }
}
