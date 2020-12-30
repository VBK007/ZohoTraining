package com.rerearray.Midarray;

import com.rerearray.Arrayfiles;

public class pirntgreaterthanprevious {
    public static void main(String[] args) {
        Arrayfiles file=new Arrayfiles();
        file.getdata1();
        int[] array=file.firstarray;
        int count=0;
        System.out.print(" "+array[0]);
        for (int i=1;i< array.length;i++){
            if (array[i]>array[i-1]){
                count=1;

            }
            else {
                count=0;
            }
            if (count==1){
                System.out.print(" "+array[i]);
            }



        }


    }
}
