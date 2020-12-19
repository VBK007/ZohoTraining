package com.company.String;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Scanner;

public class Givenwordspresentinmatrix {

    static boolean[][] visited;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char[][] array={{'P','W','K','C','T'},
                {'B','O','F','A','L'},
                {'O','O','E','R','M'},
                {'X','L','A','T','E'},
                {'A','C','O','T','N'}
                         };

//        char[][] array={{'A','B','C','D'},
//                {'S','F','C','S'},
//                {'A','D','E','E'}
//        };




        System.out.println("The words in array are as follows");
        for (char[] chars : array) {
            System.out.println(Arrays.toString(chars));
        }
        System.out.println("Enter the word to search");
        String input=scanner.nextLine();

      input=touppercase(input);

        System.out.println(input);

boolean res=isFound(array,input);
if (res){
    System.out.println("Yes Found");
}
else {
    System.out.println("Sorry Dude");
}


    }

    private static String touppercase(String input) {
String string="";

      for (int i=0;i<input.length();i++){
          char ch;
          if (input.charAt(i)>='a'&& input.charAt(i)<='z'){
              ch= (char) (input.charAt(i)-'a');
              return string+ch;
          }

      }
        return input;
    }


    private static boolean isFound(char[][] array, String input) {
       int n=input.length();
       if (n==0||n==1){
           return false;
       }
       int row=array.length;
       int col=array[0].length;

        for (int i=0;i<row;i++){
            for (int j=0;j<array[i].length;j++){
//
                   if (input.charAt(0)==array[i][j]&&  searchword(i,j,0,input,array)){

                   return true;
               }
            }
        }


       return false;
    }

    private static boolean searchword(int i, int j, int index, String input, char[][] array) {
        if (index==input.length()){
            return true;
        }

        if (i<0 || i>=array.length||j<0||j>=array[i].length||array[i][j]!=input.charAt(index)
        )

        {
            return false;
        }


char tem=array[i][j];
        array[i][j]=' ';

      boolean found=searchword(i+1,j,index+1,input,array)
                ||searchword(i-1,j,index+1,input,array)
                ||searchword(i,j+1,index+1,input,array)||
                searchword(i,j-1,index+1,input,array);
      array[i][j]=tem;
            return found;






    }




}
