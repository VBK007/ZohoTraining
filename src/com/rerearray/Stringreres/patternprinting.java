package com.rerearray.Stringreres;

import java.util.Scanner;

public class patternprinting {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        for (int i = 0; i < number; i++) {
            int res = i;
            int count=res+2;
            for (int j = 0; j < i; j++) {
                if (i > 1 && i<number-1) {

                    if (j > 0) {
                        res = res + 2;
                    }
                    System.out.print(res+" ");

                }
                else if (i==number-1){
                    System.out.print(count+" ");
                    count=count+2;

                }
                else {
                    System.out.print(res + " ");
                }
            }
            System.out.println();
        }


    }


}
