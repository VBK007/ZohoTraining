package com.rerearray.Stringreres;

import java.util.Scanner;

public class parantheischecker {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int count = 0;
        int valid_para = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(') {
                count++;
            } else if (string.charAt(i) == ')') {
                count--;
            }

            if (isoperand(string.charAt(i))) {
                if (ischar(string.charAt(i - 1)) && ischar(string.charAt(i + 1))) {
                    valid_para = 1;
                } else {
                    valid_para = 0;
                }
            }


        }
        if (count > 0 || valid_para == 0) {
            System.out.println("Not valid");
        } else {
            System.out.println("valid");
        }


    }

    private static boolean ischar(char charAt) {
        return charAt >= 'a' && charAt <= 'z';
    }

    private static boolean isoperand(char charAt) {
        return charAt == '+' || charAt == '-' || charAt == '*'
                || charAt == '%';
    }
}
