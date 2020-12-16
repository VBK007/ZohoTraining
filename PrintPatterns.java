package Strings;

import java.util.Scanner;

public class PrintPatterns {
    public static void main(String[] args) {
String str=" ";
        System.out.println("Enter the integers input");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int a=0;

        int sum = 1;
        for (int i = 0; i < input; i++) {
            sum *= 2;


        }





        for (int i = 0; i < sum; i++) {
           int count=i;
int remaindercount=0;
        while (count>0){

                int rem = count % 2;
                str=rem+str;
                remaindercount++;
                  count=count/2;


            }


      while (remaindercount<input){
         System.out.print(0);
         remaindercount++;
      }
            System.out.print(str);
//            if(j<=input)
//            {
//                //System.out.println(" " + j);
//                System.out.print(" " +a);
//                j++;
//            }

str=" ";


           System.out.println( );



        }


    }
}
