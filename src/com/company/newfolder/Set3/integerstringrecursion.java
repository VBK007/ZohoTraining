package com.company.newfolder.Set3;

import java.util.Scanner;

public class integerstringrecursion {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the String");
        String string = scanner.nextLine();
        char[] ch = string.toCharArray();


//        for (int i = 0; i < string.length(); ) {
//            char c = string.charAt(i);
//            int numb = 0;
//
//            if (isnum(string.charAt(i + 1))) {
//                System.out.print(string.charAt(i) + " ");
//                for (int k = i + 1; k < string.length(); ) {
//                    numb = Integer.parseInt(String.valueOf(string.charAt(k)));
//                    System.out.print(i + "||");
//                    i = k + 1;
//                    break;
//
//                }
//
//            }
//
//
//            for (int j = 0; j < numb; j++) {
//                System.out.print(c);
//            }
//
//
//        }

        for (int i = 0; i < ch.length; i++) {
            int value=0;
            if (isnum(ch[i])) {
                try {

                    if (isnum(ch[i+1])) {
                        String a = String.valueOf(ch[i] - 48);
                        String b = String.valueOf(ch[i + 1] - 48);
                      value = Integer.parseInt(a + b);
                        printsequence(ch[i - 1], value);
                        i++;
                    } else {
                     value =ch[i]-48;
                        printsequence(ch[i - 1], value);
                    }

                } catch (ArrayIndexOutOfBoundsException ex) {
                   value = ch[i] - 48;
                    printsequence(ch[i - 1], value);

                }


            } else {
                System.out.print(ch[i]);
            }


        }

    }

    private static void printsequence(char ch, int value) {

        for (int i=0;i<value;i++){
            System.out.print(ch);
        }

    }

    private static boolean isnum(int k) {
        if (k >= '0' && k <= '9')
            return true;

        return false;

    }
}
