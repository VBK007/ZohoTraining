package com.Tomorowzoho.First10String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Mergearray {
    public static void main(String[] args) {
        int[] array={1,2,3,6,9};
        int[] array2={2,4,5,10};
        HashSet<Integer> hashMap=new HashSet<>();
        for (int i=0;i<array.length;i++){
            hashMap.add(array[i]);
        }

        for (int i=0;i<array2.length;i++){
            hashMap.add(array2[i]);


        }


        System.out.println(Arrays.toString(new HashSet[]{hashMap}));




    }
}
