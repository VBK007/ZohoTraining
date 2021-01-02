package com.rerearray.Stringreres;

import java.util.Scanner;

public class addtwnumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        String number1 = scanner.next();
        System.out.println("Enter the b value");
        String number2 = scanner.next();

        printvalue(number1, number2);


    }

    private static void printvalue(String number1, String number2) {
        int i = number1.length() - 1;
        int j = number2.length() - 1;
        String res = "";
        int s = 0;
        while (i >= 0 || j >= 0 || s == 1) {

            s += ((i >= 0) ? number1.charAt(i) - '0' : 0);
            s += ((j >= 0) ? number2.charAt(j) - '0' : 0);

            res = (char) (s % 2 + '0') + res;

            s /= 2;
            i--;
            j--;
        }

        System.out.println(res);
    }
}
