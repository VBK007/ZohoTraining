package com.company.newfolder;

import java.util.Arrays;
import java.util.Formattable;
import java.util.Scanner;

public class wordindexdisplay {
    static  int row,col;
   static boolean[][] visited;
    public static void main(String[] args) {
        System.out.println("Enter the word to serach");
        char[][] array={{'w','e', 'L' ,'C', 'O'},
                {'M','E', 'T', 'O','Z'},
                {'O', 'H', 'O', 'C','O'},
                {'R', 'P', 'O', 'R','A'},
                {'T', 'I', 'O', 'n',' '} };

        Scanner scanner=new Scanner(System.in);
        String string=scanner.nextLine();
        visited=new boolean[array.length][array[0].length];
   row=array.length;
   col=array[0].length;
   for (int i=0;i<array.length;i++){
       for (int j=0;j<array.length;j++){
           if (array[i][j]==string.charAt(0)){{
               if (searchindex(i,j,0,string,array)){
                   System.out.println(i+" " + j);
               }
           }

           }
       }



   }

        for (int i=0;i<visited.length;i++){
            System.out.println(Arrays.toString(visited[i]));
        }





    }

    private static boolean searchindex(int i, int j, int index, String string, char[][] array) {

        if (string.length()==index){
            return true;
        }

        if (i<0||i>=array.length||j<0||j>=array[0].length||visited[i][j]){
            return false;
        }

        visited[i][j]=true;

        return searchindex(i+1,j,index+1,string,array)||
                searchindex(i-1,j,index+1,string,array)||
                searchindex(i,j+1,index+1,string,array)||
                searchindex(i,j-1,index+1,string,array);

    }

}
