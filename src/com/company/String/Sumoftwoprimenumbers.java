package com.company.String;

import java.util.Scanner;

public class Sumoftwoprimenumbers {
static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
      System.out.println("Enter the Number");
int number=scanner.nextInt();

int[] array=new int[number];
for (int i=0;i<array.length;i++){

  if (i%2!=0){
      array[i]=i;
  }

}



System.out.println();
for (int i=0;i<array.length;i++){
    if (array[i]!=0){
        System.out.print(" | "+array[i]);
    }
}

System.out.println();
boolean res=isAddeedwithprime(array,number);
if (res){
    System.out.println("Yeah");
}
else {
    System.out.println("Nailed it");
}






    }

    private static boolean isAddeedwithprime(int[] array, int number) {

    for (int i=0;i<array.length;i++){
      for (int j=0;j<array.length;j++){
          if (array[i]!=0&&array[j]!=0){
              if (array[i]+array[j]==number){
                  return true;
              }
          }
      }
    }


    return false;
    }
}
