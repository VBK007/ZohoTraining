package com.rerearray.Stringreres;

import java.util.Scanner;

public class printpatternc {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        for (int i=0;i<number;i++){
            int k=i+1;
            for (int j=0;j<number-i;k+=number-j,j++){
                System.out.print(k+" ");
            }
            System.out.println();
        }

    }
}
