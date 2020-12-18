package com.company.String;

import java.util.Scanner;

public class Strengthofpassword {
    static Scanner scanner=new Scanner(System.in);
    static int count=0,smallcount=0,containspecialchaaracter=0,iscontaindigits=0;
    public static void main(String[] args) {

        System.out.println("Enter the String Password");
        String input=scanner.nextLine();
        System.out.println("Your Original String");
        System.out.println(input);

        char[] ch=input.toCharArray();

        if (ch.length<6){
            System.out.println("Plese enter valid Address");
        }

        for (int i=0;i<ch.length;i++){


            if (isAlphapet(ch[i])){
                count++;
            }
            else if (isConatainsmallletter(ch[i])){
                smallcount++;

            }
            else if (isContainSpecialcharacter(ch[i])){
                containspecialchaaracter++;
            }
            else if (iscontaindigit(ch[i])){
                iscontaindigits++;
            }

        }





        if (count<2||smallcount<2||containspecialchaaracter<1||iscontaindigits<2){
            System.out.println("Please enter the valid IPADRESS minimum 2 special character digit Captialletter");
        }
        else {
            System.out.println("Valid Password ");
        }


    }

    private static boolean iscontaindigit(char ch) {
        return ch>='0' && ch<='9';
    }

    private static boolean isContainSpecialcharacter(char ch) {
        return ch=='!'||ch=='@'||ch=='#'||ch=='$'||ch=='%'||ch=='^'||ch=='*'||ch=='('||ch==')';


    }

    private static boolean isConatainsmallletter(char ch) {

        return ch>='a'&&ch<='z';
    }

    private static boolean isAlphapet(char ch) {

        return ch>='A'&&ch<='Z';

    }
}
