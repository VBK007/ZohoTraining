package com.revise.Array;

import java.util.Arrays;

public class duplicateelemnt {
    public static void main(String[] args) {
        Arrayfile file=new Arrayfile();
        file.getdata();
        System.out.println("original array");
        System.out.println(Arrays.toString(file.array));
        for (int i=0;i<file.array.length;i++){

            for (int j=i+1;j<file.array.length;j++){
                if (file.array[i]==file.array[j]){
                    System.out.println(file.array[i]);
                }
            }

        }

    }
}
