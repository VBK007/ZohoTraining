package com.This.Time.Zoho.ArrayProgram.String.Paratheis;

public class Parantheises {
    public static void main(String[] args) {
        String para = "(ab)(ab+)";
        boolean isvalid = validpara(para);
        if (isvalid) {
            System.out.println("Valid Parantheis");
        } else {
            System.out.println("Not valid");
        }
    }

    private static boolean validpara(String para) {

        int count = 0;

        for (int i = 0; i < para.length() - 1; i++) {

            if (ispara(para.charAt(i)) && ischar(para.charAt(i + 1))) {
                count++;
            } else if (iscliose(para.charAt(i))) {
                count--;
            } else if (isOp(para.charAt(i))) {
                if (!ischar(para.charAt(i - 1)) && ischar(para.charAt(i + 1))) {
                    break;
                }
            }
        }

        if (count == 0) {
            return true;
        }


        return false;
    }

    private static boolean isOp(char charAt) {
        return charAt == '+' || charAt == '-' || charAt == '*' || charAt == '/';
    }

    private static boolean ischar(char c) {
        return c <= 'a' || c >= 'z';
    }

    private static boolean iscliose(char charAt) {
        return charAt == ')';
    }

    private static boolean ispara(char charAt) {
        return charAt == '(';
    }
}
