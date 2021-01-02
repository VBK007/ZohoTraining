package com.rerearray.Stringreres;

import java.util.Arrays;
import java.util.Scanner;

public class countnumberofwordsinstring {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the words");
        String string = scanner.nextLine();
        System.out.println("Enter the particular word to find");
        String word = scanner.next();
        System.out.println(countnumberofocuurance(string, word));


    }

    private static int countnumberofocuurance(String string, String word) {
        int count = 0;
        String a[] = split(string, " ");

        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            if (word.equals(a[i]))
                count++;

        }

        return count;
    }

    private static String[] split(String string, String s) {
        String[] stroresplit = new String[string.length()];
        int count = 0;
        char compare1, compare2;
        for (int i = 0; i < string.length(); i++) {
            stroresplit[i] = "";
        }
        for (int i = 0; i < string.length(); i++) {
            compare1 = string.charAt(i);
            compare2 = s.charAt(0);
            if (!(compare1 == compare2)) {
                stroresplit[count] += "" + string.charAt(i);
            } else {
                count++;
                stroresplit[count++] = "" + string.charAt(i);
                count++;
            }


        }

        return stroresplit;
    }
}
