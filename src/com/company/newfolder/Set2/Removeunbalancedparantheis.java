package com.company.newfolder.Set2;

import java.util.Scanner;

public class Removeunbalancedparantheis {

    public static void main(String[] args) {
        System.out.println("Enter the parantheis");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("your Original String");

        String res = isValidparatheis(input);
        System.out.println(res);


    }

    private static String isValidparatheis(String input) {

        if (input.length() == 0 || input.length() == 1)
            return input;

        StringBuilder string = new StringBuilder();
        int open = 0;

        char[] array =input.toCharArray();
        int c=0;
        for ( c=0;c<array.length;c++) {

            if (input.charAt(c) == '(') {

                open++;

            } else if (input.charAt(c) == ')') {
                if (open == 0)
                    continue;
                open--;
            }

            string.append(c);


        }
System.out.println(string);

        StringBuilder result = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == '(' && open-- > 0)
                continue;

            result.append(input.charAt(i));
        }


        return result.reverse().toString();

    }

}
