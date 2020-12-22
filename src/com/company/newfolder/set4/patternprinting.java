package com.company.newfolder.set4;

import java.util.Scanner;

public class patternprinting {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int num = 1;
        for (int i = 0; i < number; i++) {


            System.out.println(num);
            num = findnewnum(num);


        }
    }

    private static int findnewnum(int num) {
        int digit = 0;
        int newnumber = 0;
        int multiplier = 1;
        while (num > 0) {
            int count = 0;
            do {
                digit = num % 10;
                num = num / 10;
                count++;
            }
            while (digit == num % 10);

            newnumber = newnumber + (count * 10 + digit) * multiplier;
            multiplier *= 100;
        }


        return newnumber;


    }


}
