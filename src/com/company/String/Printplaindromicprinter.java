package com.company.String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Printplaindromicprinter {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the output");
       int number=scanner.nextInt();

       generate(number);

    }

    private static void generate(int number) {

        List<List<Integer>> triangle=new ArrayList<>();
        if (number==0){
            return;
        }

        List<Integer> firstrow=new ArrayList<>();
        firstrow.add(1);
        triangle.add(firstrow);
        for (int i=1;i<number;i++){
            List<Integer> previousrow=triangle.get(i-1);
            List<Integer> row=new ArrayList<>();
            row.add(1);
            for (int j=1;j<i;j++){
              
                row.add(previousrow.get(j-1)+previousrow.get(j));


            }

            row.add(1);
            triangle.add(row);
        }


        for (List<Integer> x:triangle){
            System.out.println(x);
        }


    }

//    private static void generate(int number) {
//      List<List<Integer>>  triangle=new ArrayList<>();
//        if (number==0)
//            return;
//
//        List<Integer> row=new ArrayList<>();
//        row.add(1);
//        triangle.add(row);
//        for (int i=1;i<number;i++){
//            List<Integer> previousrow=triangle.get(i-1);
//             List<Integer> secondrow=new ArrayList<>();
//
//           secondrow.add(1);
//            for (int j=1;j<i;j++){
//                secondrow.add(previousrow.get(j-1)+previousrow.get(j));
//            }
//            secondrow.add(1);
//            triangle.add(secondrow);
//
//        }
//
//
//
//
//        for (List<Integer> x:triangle){
//            System.out.println(x);
//        }
//
//
//    }




}
