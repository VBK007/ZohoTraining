package com.rerearray.Stringreres;

import java.util.Arrays;
import java.util.Scanner;

public class findfriends {
    public static void main(String[] args) {
        System.out.println("Enter the number of input");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        String[] myprofile = new String[number];
        String[] friends = new String[20];
        String[] input = new String[number];
        int k = 0;
        int numbe = 0;
        for (int i = 0; i < number; i++) {
            Scanner scanner1 = new Scanner(System.in);
            int flag = 0;

            myprofile[i] = "";
            friends[k] = "";
            input[i] = scanner1.nextLine();

            for (int j = 0; j < input[i].length(); j++) {
                String str = "";
                int comma = 0;
                boolean b = input[i].charAt(j) >= 'a' && input[i].charAt(j) <= 'z';
                boolean c = input[i].charAt(j) >= 'A' && input[i].charAt(j) <= 'Z';
                if (isdigit(input[i].charAt(j)))
                    flag = 1;
                if ((b || c) && flag == 0) {
                    myprofile[i] = myprofile[i] + input[i].charAt(j);
                } else if ((b || c) || input[i].charAt(j) == ' ') {

                    if (input[i].charAt(j) == ' ')
                        comma = 1;
                    str = "";
                    System.out.print(" ");


                    if (comma == 0) {
                        str += input[i].charAt(j);
                        System.out.print(str);

                    }
                    friends[k] = str;
                    System.out.println(k+" || ");
                    k++;
                    System.out.println(" | "+k);


                }


            }

        }


        System.out.println(Arrays.toString(myprofile));
        System.out.println(Arrays.toString(friends));


    }

    private static boolean isdigit(char charAt) {

        return charAt >= '0' && charAt <= '9';
    }
}
