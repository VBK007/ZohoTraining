package com.company.newfolder.set4;

import java.util.Scanner;

public class oddnumberbetweenrange {
   static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the start index");
        int start=scanner.nextInt();
        System.out.println("Enter the End index");
        int end=scanner.nextInt();

        System.out.println("Odd element in given range");
        for (int i=start;i<end;i++){
            if (i%2==1){
                System.out.print(" "+i);
            }
        }
    }
}
