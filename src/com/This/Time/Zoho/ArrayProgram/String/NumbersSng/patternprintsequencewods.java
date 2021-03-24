package com.This.Time.Zoho.ArrayProgram.String.NumbersSng;

public class patternprintsequencewods {
    static int ind = 0;

    public static void main(String[] args) {
        String str = "a1b4c3";
        printstr(str);

    }

    private static void printstr(String str) {
        String st = "";
        char c = ' ';

        for (int i = 0; i < str.length(); i++) {

            if (ischar(str.charAt(i))) {
                c = str.charAt(i);
            }
            if (Character.isDigit(str.charAt(i))) {
                st = findnumberofocurance(str, i, c);
                System.out.print(st);
                c = ' ';
                st = " ";
            }


        }

    }

    private static String findnumberofocurance(String str, int i, char c) {
        int num = 0;
        String st = "";
        int j = 0;
        for (j = i; j < str.length(); j++) {

            if (Character.isDigit(str.charAt(j))) {
                if ((j + 1) < str.length() && Character.isDigit(str.charAt(j + 1))) {
                    st = str.charAt(j) + "" + str.charAt(j + 1);
                    num = Integer.parseInt(st);
                    st = "";


                } else {
                    num = (str.charAt(j) - 48);
                }
            } else {

                break;
            }


        }
        ind = j;


        for (int v = 0; v < num; v++) {
            st += c;
        }

        return st;
    }

    private static boolean ischar(char charAt) {
        return charAt >= 'a' && charAt <= 'z';
    }
}
