package com.rerearray.Stringreres;

import javax.swing.text.html.StyleSheet;
import java.util.Arrays;
import java.util.Scanner;

public class reversestringwithoutchangingfunction {
    public static void main(String[] args) {
        System.out.println("Enter the String");
//        Scanner scanner = new Scanner(System.in);
        String inputstring = "A man, in the boat says : I see 1-2-3 in the sky";
        char[] inputarray = inputstring.toCharArray();
        char[] resultstring = new char[inputstring.length()];
        printString(inputarray, resultstring, inputstring);

    }

    private static void printString(char[] inputarray, char[] resultstring, String inputstring) {

        for (int i = 0; i < inputarray.length; i++) {
            if (isspecial(inputarray[i])) {
                resultstring[i] = inputarray[i];
            }
        }
        int j = resultstring.length - 1;
        for (int i = 0; i < inputarray.length; i++) {
            if (!isspecial(inputarray[i])) {
                if (isspecial(resultstring[j])) {
                    j--;
                }
                resultstring[j] = inputarray[i];
                j--;
            }

        }
        System.out.println(String.valueOf(resultstring));

    }

    private static boolean isspecial(char c) {

        return (c == ' ' || c == '@' || c == '-' || c == '!' || c == ',' || c == ':' || c == '_');

    }
}
