package com.company;

import java.util.Scanner;

public class findoddandevencount {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int oddcount=0;
        int evencount=0;

        while (number>0){

            int remainder=number%10;

            if (remainder%2==0){
                evencount++;
            }
            else {
                oddcount++;
            }

            number=number/10;




        }





        System.out.println("Odd count" +oddcount);
        System.out.println("Even Count "+evencount);





    }

}
