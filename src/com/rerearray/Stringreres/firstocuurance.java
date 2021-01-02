package com.rerearray.Stringreres;

import java.util.Scanner;

public class firstocuurance {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner scanner = new Scanner(System.in);
        String fs = scanner.next();
        System.out.println("Enter the Secound String");
        String se = scanner.next();

        int n = isfound(fs, se);
        System.out.println(" " + n);


    }

    private static int isfound(String fs, String se) {

        if (fs.length() == 0 || se.length() == 0)
            return -1;
        int index = 0;

        for (int j = se.length() - 1; j >= 0; j--) {
            for (int i = 0; i < fs.length(); i++) {
                if (se.charAt(j)==fs.charAt(i)){
                    index=i;
                    break;
                }


                else {
                    index=-1;
                }
            }

            if (index==-1){
                break;
            }


        }


        return index;
    }
}
