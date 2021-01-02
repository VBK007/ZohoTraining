package com.rerearray.Midarray;

import com.revise.Array.Arrayfile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class fathersons {
    public static void main(String[] args) {
        System.out.println("Enter the number of inputs");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String[] input = new String[number];
        String[] father = new String[number];
        String[] chils = new String[number];
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            input[i] = scanner.next();
            father[i] = "";
            chils[i] = "";
            int count = 0;
            for (int j = 0; j < input[i].length(); j++) {
                boolean b = input[i].charAt(j) >= 'A' && input[i].charAt(j) <= 'Z';
                boolean c = input[i].charAt(j) >= 'a' && input[i].charAt(j) <= 'z';
                if (input[i].charAt(j) == ',')

                    count = 1;
                if ((b || c) && count == 0) {
                    chils[i] = chils[i] + input[i].charAt(j);
                } else if (b || c) {
                    father[i] = father[i] + input[i].charAt(j);
                }


            }


        }


        System.out.println(Arrays.toString(father));
        System.out.println(Arrays.toString(chils));

        System.out.println("Enter the father name to search");
        String search = scanner.next();

        for (int i = 0; i < father.length; i++) {
            if (father[i].contains(search)) {
                list.add(chils[i]);
            }
        }

        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < father.length; j++) {
                if (father[j].equals(list.get(i))) {
                    count++;
                }
            }
        }


        System.out.println(count);


    }
}
