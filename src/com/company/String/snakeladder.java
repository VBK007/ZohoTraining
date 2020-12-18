package com.company.String;

import java.util.Arrays;
import java.util.Scanner;

public class snakeladder {
    static Scanner scanner=new Scanner(System.in);
    static int value=0;
    private void display() {


int s=100;
        int[][] array=new int[10][10];
        for (int i=0;i<10;i++){

            if (i%2==0){
                for (int j=0;j<10;j++){
                    array[i][j]=s;
                    s--;
                }
            }
            else {
                for (int j=array[i].length-1;j>=0;j--){
                    array[i][j]=s;
                    s--;
                }
            }


        }


        System.out.println();
        for (int i=0;i<array.length;i++){
            System.out.println(Arrays.toString(array[i]));
        }

        int[] laddderarray={5,17,35,47,65,88};
        int[] snake={4,16,31,45,67,55};


result(array,laddderarray,snake);




    }

    private void result(int[][] array, int[] laddderarray, int[] snake) {
        int number;
        do {
            System.out.println("Enter the number from(1 to 6)");
           number=scanner.nextInt();
            int n=diaped(array,number,laddderarray,snake);
            System.out.println(n);

        }
        while (number!=0);
    }

    private int diaped(int[][] array,int number, int[] laddderarray, int[] snake) {

value+=number;
      for (int i=0;i<array.length;i++){
          for (int j=0;j<array[i].length;j++){

            if (array[i][j]==value){

             int   firstvalue=array[i][j];

                for (int l=0;l<laddderarray.length;l++){

                    if (firstvalue==laddderarray[l]){

                      return   value+=5;
                    }
                    else if (firstvalue==snake[l]){
                       return value-=5;
                    }
                }

            }




          }
      }

return value;
    }

    public static void main(String[] args) {
        int answer=1;
        while (answer==1) {
            snakeladder snk = new snakeladder();
            snk.display();
            System.out.println("Do you want to continue ");
            answer=scanner.nextInt();

        }
    }



}
