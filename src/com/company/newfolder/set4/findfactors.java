package com.company.newfolder.set4;

import java.util.Arrays;
import java.util.Scanner;

public class findfactors {
    static int[] arrayele;
    public static void main(String[] args) {
        System.out.println("Enter the array data one by one");
        int[] array=new int[5];
        arrayele=new int[array.length];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<array.length;i++){
            array[i]=sc.nextInt();

        }

        for (int i=0;i<array.length;i++){
            findAccourance(array[i],i);
        }

        for (int i=0;i<array.length-1;i++){
            if (arrayele[i]<arrayele[i+1]){
                int temp=array[i];
                array[i]=array[i+1];
                array[i+1]=temp;

                int tempi=arrayele[i];
                arrayele[i]=arrayele[i+1];
                arrayele[i+1]=tempi;

            }
            else if (arrayele[i]==arrayele[i+1]){
                if (array[i]<array[i+1]){
                    int temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                }
            }
        }



        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayele));


    }

    private static void findAccourance(int number, int i) {

        int count=0;
          for (int j=1;j<=number;j++){

              if (number%j==0){
                  count++;
              }


          }

          arrayele[i]=count;


    }
}
