package com.company.String;

import java.util.Scanner;

public class Printpattern4 {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();

        for (int i=1;i<number;i++){
            int j;
            for (j=1;j<=number/2;j++){
                if (i==j){
                    System.out.print(j);
                }
                else if (i>4&&j==number-i){
                    System.out.print(j);
                }
                else {
                    System.out.print(" ");
                }
            }
            j=j-2;
            while (j>0){
                if (i==j){
                    System.out.print(j);
                }
                else if (i>4&&j==number-i){
                    System.out.print(j);
                }
                else {
                    System.out.print(" ");
                }
                j--;
            }

            System.out.println("");
        }

    }
}
