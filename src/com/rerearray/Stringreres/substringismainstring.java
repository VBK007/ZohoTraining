package com.rerearray.Stringreres;

import java.util.Scanner;

public class substringismainstring {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the main string");
        String firststring = scanner.next();
        System.out.println("Enter the Secound String");
        String seoundstring = scanner.next();

        boolean res = issunbstring(firststring, seoundstring);
        if (res) {
            System.out.println("YES");
        } else {
            System.out.println("False");
        }


    }

    private static boolean issunbstring(String firststring, String seoundstring) {
        int count = 0;
        int main_count = 0;
        for (int i = 0; i < seoundstring.length(); i++) {
            for (int j = 0; j < firststring.length(); j++) {
                if (isnotregular(seoundstring.charAt(i))) {
                    main_count = 1;
                }
                if (seoundstring.charAt(i)==firststring.charAt(j))
                {
                    count=1;
                    break;
                }

            }
        }

        return main_count==1&&count==1;


    }

    private static boolean isnotregular(char charAt) {
        return charAt == '*' || charAt == '\'';
    }
}
