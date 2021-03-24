package com.Tomorowzoho.First10String.Second10;

import java.util.Arrays;

public class Secoundmax {
    public static void main(String[] args) {
        int[] array={3,2,7,6,5,1,2,3,4};
System.out.println(Arrays.toString(array));

        for (int i=0;i<array.length;i++){
            int j;
            int max=array[i];
            for ( j=i;j<i+3;j++){
                if (max<array[j]){
                    max=array[j];
                }

            }

            System.out.print(max+" ");

            if (j==array.length){
                break;
            }

        }

    }
}
