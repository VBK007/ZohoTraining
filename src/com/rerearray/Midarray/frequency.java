package com.rerearray.Midarray;

import com.rerearray.Arrayfiles;

import java.util.Arrays;

public class frequency {
    public static void main(String[] args) {
        Arrayfiles file = new Arrayfiles();
        file.getdata1();
        int[] array = file.firstarray;
        int[] frequency = new int[array.length];
        Arrays.sort(array);
        int visited=-1;
        for (int i=0;i<array.length;i++){
            int count=1;
            for (int j=i+1;j< array.length;j++){
                if (array[i]==array[j]){
                    frequency[j]=visited;
                    count++;

                }

                if (frequency[i]!=visited){
                    frequency[i]=count;
                }

            }

        }


        for (int i=0;i< frequency.length;i++){
            if (frequency[i]!=visited){
                System.out.println(" "+array[i]+"|| "+ frequency[i]);
            }
        }




    }
}
