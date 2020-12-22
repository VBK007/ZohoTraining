package com.company.newfolder.Set3;

import java.util.Scanner;

public class String2substringof1 {

    public static void main(String[] args) {
        System.out.println("Enter the String 1");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println("Enter the Second String");
        String substrin2 = scanner.nextLine();

        int index = findindex(string, substrin2);

        System.out.println(index);

    }

    private static int findindex(String string, String substrin2) {

        if (isempty(string) && isempty(substrin2)) {
            return 0;
        }


        int index = 0, count = 0;
        while (true) {
            index = substrin2.indexOf(string, index);
            System.out.println(index);
            if (index != -1) {
                count ++;
                index += substrin2.length();
            } else {
                break;
            }
        }



        return count;
    }

    private static boolean isempty(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        return false;
    }
}
