package com.company.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class setofwordds2 {
    static
    String word="";
    static int previous_count=0;
    static   char fav;
    public static void main(String[] args) {
//        System.out.println("Enter the number of words");
        Scanner scanner=new Scanner(System.in);
        int numbeer=4;

        System.out.println("Enter the String one by one");
        String[] array=new String[numbeer];

        for (int i=0;i<numbeer;i++){

            word=scanner.nextLine();
            array[i]=word;
            word="";

        }

System.out.println("Enter the fav Character");
       fav=scanner.next().charAt(0);
        System.out.println("Your words");
        System.out.println(Arrays.toString(array));


        for (int i=0;i< array.length;i++){
          int k=findcount(array[i]);
          int count=0;
          for (int j=0;j<array[i].length();j++){

              count++;
              word+=array[i].charAt(j);
              if (k<=15)
              {
                System.out.print(word);
                  word=" ";
              }


          }
System.out.println(word);
word="";

        }








    }

    private static int findcount(String s) {
        int count=0;
       for (int i=0;i<s.length();i++){

          if (s.charAt(i)!=fav&& s.charAt(i)!=' '){
              count++;
          }


       }


return count;
    }



}
