package com.Revise.String;

import java.util.Scanner;

public class printpattern {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int result = 1;
        int mainnum=number;
        while (number != 0) {
            result = result * 2;
            number--;
        }
        String str=" ";
        for (int i=0;i<result;i++){
            int num=i;
            int remaindercpount=0;
            while (num>0){
                int rem=num%2;
                str=rem+str;
                remaindercpount++;
                num=num/2;
            }

            while (remaindercpount<mainnum){
                System.out.print(0);
                remaindercpount++;
            }

            System.out.print(str);

            str=" ";
            System.out.println();


        }




    }


}
