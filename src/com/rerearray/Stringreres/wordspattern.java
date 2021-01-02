package com.rerearray.Stringreres;

import java.util.Scanner;

public class wordspattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the new number");
        int number = scanner.nextInt();
        int num = 1;
        for (int i = 0; i < number; i++) {
            System.out.println(num);
            num = findnumberi(num);
        }

    }

    private static int findnumberi(int num) {
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
            newnumber=newnumber+(count*10+digit)*multiplier;
            multiplier*=100;

        }

        return newnumber;
    }

    private static int findnumber(int num) {
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
