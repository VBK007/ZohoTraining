package com.This.Time.Zoho.ArrayProgram.String.Paratheis;

public class UnbalanceParantheises {
    public static void main(String[] args) {
        String str = "((abc)((de))";
        String isvalid = validestring(str);
        System.out.println(isvalid);


    }

    private static String validestring(String str) {
        int open=0;
        for (int c = 0; c < str.length(); c++) {
            if (str.charAt(c) == '(') {
                open++;

            } else if (str.charAt(c) == ')') {
                if (open == 0)
                    continue;
                open--;
            }

        }

        StringBuilder result=new StringBuilder();
        for (int j=str.length()-1;j>=0;j--){
            if (str.charAt(j)=='('&&open-->0)
                continue;

            result.append(str.charAt(j));
        }

        return result.reverse().toString();

    }
}
