package com.Tomorowzoho.First10String.Second10;

import java.util.Arrays;

public class insertzeroatlast {
    public static void main(String[] args) {
        int[] array={1,0,1,1,2,3,0,1};
        int count=0;
        for (int i=0;i<array.length;i++){

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
