package com.company.String;

import java.util.Arrays;
import java.util.Scanner;

public class Primefactor {
 static    int[] temparray;
    public static void main(String[] args) {
        System.out.println("Enter the array elemet max");
        int[] array=new int[6];
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }

        System.out.println(Arrays.toString(array));

       temparray=new int[array.length];


        for (int i=0;i<array.length;i++){
            findprimefactor(array[i],i);
        }

System.out.println();
        System.out.println(Arrays.toString(temparray));

System.out.println("Mininmum prime factors after swapping");
int visited=-1;
for (int i=0;i< temparray.length;i++){
    int j;
if (i == temparray.length - 1 && temparray[i]!=visited) {
    j = 0;
}
        for ( j = i+1; j < temparray.length; j++) {
            if (temparray[i] != visited && temparray[j] != visited) {
                if (temparray[i] > temparray[j]) {
                    int temp = temparray[i];
                    temparray[i] = temparray[j];
                    temparray[j] = temp;

                    int swap=array[i];
                    array[i]=array[j];
                    array[j]=swap;

                }
                if (temparray[i]==temparray[j]){
                    if (array[i]>array[j]){
                        int temp = temparray[i];
                        temparray[i] = temparray[j];
                        temparray[j] = temp;

                        int swap=array[i];
                        array[i]=array[j];
                        array[j]=swap;

                    }

                }

            }
        }


}

System.out.println(Arrays.toString(temparray));

System.out.println(Arrays.toString(array));


    }

    private static void findprimefactor(int in, int index) {
        int count=0;

   for (int i=2;i<in;i++){

       while (in%i==0){
           count++;
          in=in/2;
       }


   }
        if (in>2){
            count=count+1;
        }


        temparray[index]=count;

    }
}
