package com.rerearray.Stringreres;

import java.util.Scanner;

public class numberwords {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Not a valid number");

        } else {
            numberwords a = new numberwords();
            a.pw(((number / 1000) % 100), " thousand");
            a.pw(((number / 100) % 10), " hundred");
            a.pw((number % 100), " ");
        }


    }

    private void pw(int i, String thousand) {

        String[] ones = {" ", " one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine", "ten", "level",
                "twelve", "thirteen", "fourtieen", "fifiteen", "sizteen",
                "seventeen", "eighteen", "nineteen"
        };
        String[] twos = {" ", " ", " Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        if (i < 19) {
            System.out.print(ones[i]+" ");
        } else {
            System.out.print(twos[i / 10] + " " + ones[i % 10]);
        }

        if (i >0) {
            System.out.print(thousand+ " ");
        }

    }
}
