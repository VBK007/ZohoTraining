package com.company.String;

import java.util.Scanner;

public class Printpattern3 {

    public static void main(String[] args) {
        System.out.println("Enter the array elements");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        for (int i=1;i<number;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i*j+" ");
            }
            System.out.println(" ");
        }

    }
}
