package com.company.String;

import java.util.Scanner;

public class Printpattern2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scanner.nextInt();
        int i,j;
        for (i=1;i<=number;i++){

            for (j=1;j<=number;j++){
                if (i==j){
                    System.out.print("*");
                }
                else {
                    System.out.print("0");
                }
            }
            j--;
            System.out.print("*");

            while (j>=1){
                if (i==j){
                    System.out.print("*");
                }
                else {
                    System.out.print("0");

                }
                j--;
            }
            System.out.println("");

        }



    }
}
