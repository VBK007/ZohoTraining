package com.rerearray.Stringreres;

import java.util.Scanner;

public class printpattern {
    public static void main(String[] args) {
        System.out.println("Enter the input");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 1;
        if (number > 1) {
            sum = sum << number;

        }

        for (int i = 0; i < sum; i++) {
            int count = i;
            int remaindercount = 0;
            String str = "";
            while (count > 0) {

                int rem = count % 2;
                str = rem + str;
                remaindercount++;
                count = count / 2;


            }


            while (remaindercount < number) {
                System.out.print(0);
                remaindercount++;
            }
            System.out.print(str);
//            if(j<=input)
//            {
//                //System.out.println(" " + j);
//                System.out.print(" " +a);
//                j++;
//            }


            System.out.println();


        }

    }
}
