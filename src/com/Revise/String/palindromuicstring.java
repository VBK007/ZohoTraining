package com.Revise.String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class palindromuicstring {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the String");
        int input = scanner.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        printpat(input, list);
        for (List<Integer> x : list) {
            System.out.println(x);
        }





    }

    private static List<List<Integer>> printpat(int input, List<List<Integer>> list) {

        List<Integer> firstrow = new ArrayList<>();
        firstrow.add(1);
        list.add(firstrow);

        for (int i = 1; i < input; i++) {
            List<Integer> prevrow = list.get(i - 1);
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for (int j = 1; j < i; j++) {
                row.add(prevrow.get(j - 1) + prevrow.get(j));
            }

            row.add(1);
            list.add(row);


        }


        return list;
    }


}
