package com.rerearray.Stringreres;

import java.util.Scanner;

public class printnumbersequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String string = scanner.nextLine();
        char[] ch = string.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int value = 0;
            if (isnumber(ch[i])) {
                try {
                    String res = String.valueOf(ch[i] - 48);
                    if (isnumber(ch[i + 1])) {
                        String re = String.valueOf(ch[i + 1] - 48);
                        value = Integer.parseInt(res + re);
                        printsequence(ch[i - 1], value);
                        i++;
                    } else {
                        value = Integer.parseInt(res);
                        printsequence(ch[i - 1], value);
                    }

                } catch (ArrayIndexOutOfBoundsException e) {
                    value = ch[i] - 48;
                    System.out.println(" | " + value);
                    printsequence(ch[i - 1], value);
                }


            } else {
                System.out.print(ch[i]);
            }

        }


    }

    private static void printsequence(char charAt, int res) {

        for (int i = 0; i < res; i++) {
            System.out.print(charAt);
        }

    }

    private static boolean isnumber(char charAt) {
        return charAt >= '0' && charAt <= '9';

    }

    private static boolean ischar(char charAt) {
        return charAt >= 'a' && charAt <= 'z';
    }
}
