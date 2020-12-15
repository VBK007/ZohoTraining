package Cryptography;

import java.util.Arrays;
import java.util.Scanner;

public class Alternativelysort {
    public static void main(String[] args) {
        System.out.println("Enter the Array size");
        Scanner scanner = new Scanner(System.in);
        int arraysize = scanner.nextInt();
        System.out.println("Enter the array data one by one");
        int[] array = new int[arraysize];

        for (int i = 0; i < arraysize; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Before swapping:");
        for (int i = 0; i < arraysize; i++) {
            System.out.print(" | " + array[i]);
        }
        int[] anotherarray = new int[arraysize];

        for (int i = 0; i < arraysize; i++) {
            anotherarray[i] = array[i];
        }

        System.out.println();

        Arrays.sort(anotherarray);


        int s1=array.length;
int s2=anotherarray.length-1;
for (int i=0;i<s1/2;i++){
  if (s1%2==1){
      System.out.print(" "+anotherarray[s2]+" "+anotherarray[i]);
      s2--;


      if (i==(s1/2)-1){
          System.out.print(" "+anotherarray[s1/2]);
      }
  }
  else {
      System.out.print(" "+anotherarray[s2]+" "+anotherarray[i]);
      s2--;
  }
}








        System.out.println();
        System.out.println("Another array data");
        for (int i = 0; i < arraysize; i++) {
            System.out.print(" | " + anotherarray[i]);
        }


    }

}
