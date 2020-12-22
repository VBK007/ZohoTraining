package com.company.newfolder.Set3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class twosortedarray {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        int[] array = {2, 4, 5, 6, 7, 9, 10, 13};
        int[] array2 = {2, 3, 4, 5, 6, 7, 8, 9, 11, 15};

        int[] mixture = new int[array2.length+array.length];

        int k = 0;
        int index = 0;
        while (index < array.length) {
            mixture[k] = array[index];
            k++;
            index++;
        }

        index = 0;

        while (index < array2.length) {
            mixture[k] = array2[index];
            k++;
            index++;

        }

        Set<Integer> mapwithoutduplicate=new HashSet<>();
        for (int i=0;i<mixture.length;i++){
            mapwithoutduplicate.add(mixture[i]);
        }

        Iterator it=mapwithoutduplicate.iterator();

        int[] mapwithoutdupi=new int[mapwithoutduplicate.size()];

        int n=0;
        while (it.hasNext()){
            mapwithoutdupi[n]= (int) it.next();
            n++;

        }

        Arrays.sort(mapwithoutdupi);
        System.out.println(Arrays.toString(mapwithoutdupi));


    }
}
