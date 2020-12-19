package com.company.String;

import java.util.Arrays;
import java.util.Scanner;

public class setofwords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the words");
        String words = "Zoho,Eating,Watching,Pogo,Loving,Mango";
        System.out.println("Enter the favorite char");
        char favchar = scanner.next().charAt(0);
        int coma = 0;

        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i) == ',') {
                coma++;
            }
        }


        String[] array = new String[coma + 1];
        String str = "";

        for (int i = 0, j = 0; i < words.length(); i++) {

            if (words.charAt(i) == ',') {
                array[j] = str;
                j++;
                str = "";
            } else {
                str = str + words.charAt(i);
            }
            array[j] = str;

        }

        System.out.println();
        System.out.println("Your favorite character :" + favchar);
        System.out.print("Words: ");
        System.out.println(Arrays.toString(array));
        System.out.println();

        int[] count = new int[coma + 1];

        for (int i = 0; i < array.length; i++) {
            int wordcount = 0;

            String word = "";

            for (int j = 0; j < array[i].length(); j++) {
                word = array[i];

                if (word.charAt(j) != favchar && words.charAt(i) != ' ') {

                    wordcount++;


                }

            }
            count[i]=wordcount;

        }

        for (int i=0;i<array.length;i++){
            System.out.print(" | "+count[i]);
        }
System.out.println();

int visited=-1;
        for (int i=0;i<array.length;i++){
           if (count[i]!=visited){
               for (int j=0;j<array.length;j++){
                   if (count[i]+count[j]==10){
                       if (count[i]<count[j]){
                           count[i]=visited;
                           count[j]=visited;
                           System.out.println(array[j]+" "+array[i]);
                       }
                   }

                   }



               }
           }
        for (int i=0;i<array.length;i++){
            System.out.print(" | "+count[i]);
        }
        System.out.println();



    }




    }


