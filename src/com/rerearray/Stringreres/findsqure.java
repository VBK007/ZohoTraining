package com.rerearray.Stringreres;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class findsqure {
    public static void main(String[] args) {
        System.out.println("Enter the start number");
        Scanner scanner=new Scanner(System.in);
        int start=scanner.nextInt();
        System.out.println("Enter the end point");
        int end=scanner.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=1;i<20;i++){
            map.put(i,(i*i));
        }

        System.out.println(Arrays.toString(new HashMap[]{map}));

        for (int i=start;i<=end;i++){
            if (map.containsValue(i)){
                System.out.println(i+" ");
            }
        }


    }
}
