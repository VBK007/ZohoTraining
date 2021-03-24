package com.Tomorowzoho.First10String.Second10;

import java.util.Scanner;

public class wordstostring {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        wordstostring ws = new wordstostring();
        ws.numbertoword(((number / 1000) % 100), "thousand");
        ws.numbertoword(((number / 100) % 10), "hundred");
        ws.numbertoword(((number % 100)), " ");


    }

    private void numbertoword(int i, String thousand) {

        String[] ones = {" ", " one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine", "ten", "level",
                "twelve", "thirteen", "fourtieen", "fifiteen", "sizteen",
                "seventeen", "eighteen", "nineteen"
        };
        String[] twos = {" ", " ", " Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        if (i < 19) {
            System.out.print(ones[i] + " ");
        } else {
            System.out.print(twos[i / 10] + " " + ones[i % 10]);
        }
        if (i > 0) {
            System.out.print(thousand + " ");
        }

    }
}
