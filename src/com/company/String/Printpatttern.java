package com.company.String;

import java.util.Scanner;

public class Printpatttern {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();

        for (int i=1;i<=number;i++){
            for (int j=number;j>=1;j--){
                if (j!=i){
                    System.out.print(j);
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }

    }

}
