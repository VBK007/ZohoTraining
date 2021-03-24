package com.Tomorowzoho.First10String;

public class mathematiCALEXPRESSION {
    public static void main(String[] args) {
        String string="(a+b)(a*b)";
        boolean isis=isvalid(string);
        if (isis){
            System.out.println("YES");
        }

        string="(ab)(ab+)";

        isis=isvalid(string);
        if (isis){
            System.out.println("YES");
        }


    }

    private static boolean isvalid(String s) {

        for (int i=0;i<s.length();i++){

        }

return false;
    }
}
