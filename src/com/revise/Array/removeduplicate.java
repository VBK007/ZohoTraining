package com.revise.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class removeduplicate {
    public static void main(String[] args) {
        Arrayfile file=new Arrayfile();
        file.getdata();
        int[] array=file.array;
        System.out.println(Arrays.toString(file.array));

        int n=findlenghtwithoutduplicate(array,array.length);

//        HashSet<Integer> hashSet=new HashSet<>();
//        for (int i=0;i<array.length;i++){
//            hashSet.add(array[i]);
//        }
//
//
//     int[] duplicatearray=new int[hashSet.size()];
//        Iterator<Integer> iterator=hashSet.iterator();
//        int n=0;
//        while (iterator.hasNext()){
//            duplicatearray[n++]=iterator.next();
//
//        }f
        for (int i=0;i<n;i++){
            System.out.print(" "+array[i]);
        }







    }

    private static int findlenghtwithoutduplicate(int[] array, int length) {
        int[] duplicatearray=new int[length];
        int j=0;
        for (int i=0;i<array.length-1;i++){
            if (array[i]!=array[i+1]){
              duplicatearray[j++]=array[i];
            }

        }
        duplicatearray[j++]=array[length-1];

        for (int i=0;i<duplicatearray.length;i++){
            array[i]=duplicatearray[i];
        }



        return j;
    }




}
