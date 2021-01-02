package com.rerearray.Stringreres;

import com.rerearray.Arrayfiles;

import java.util.*;

public class unionintersectionexcept {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Arrayfiles file = new Arrayfiles();
        file.getdata();
        int[] farray = file.firstarray;
        int[] secarray = file.secoundarray;
        HashSet<Integer> union = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();
        HashSet<Integer> except = new HashSet<>();

        int index = 0;
        while (index < farray.length) {
            union.add(farray[index]);
            index++;

        }
        System.out.println("Before ");
        for (Integer integer : union) {
            System.out.print(" " + integer);

        }
        System.out.println();
        index=0;
        while (index< secarray.length){
            union.add(secarray[index]);
            index++;
        }

System.out.println("After ");
        for (Integer integer : union) {
            System.out.print(" " + integer);

        }



    }
}
