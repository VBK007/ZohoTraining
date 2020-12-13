package com.company;

import java.util.Scanner;

public class Freuencythree {

    public static void main(String[] args) {
        System.out.println("Enter the Array element size");
        Scanner scanner=new Scanner(System.in);
        int arraysize=scanner.nextInt();
        System.out.println("Enter the array elemts one by one");
        int[] array=new int[arraysize];
        for (int i=0;i<arraysize;i++){
            array[i]=scanner.nextInt();
        }

        System.out.println();

        int visited=-1;
        int[] frequecncy=new int[arraysize];
        for (int i=0;i<arraysize;i++){
            int count=1;
            for (int j=i+1;j<arraysize;j++){

                if (array[i]==array[j]){

                    count++;
                    frequecncy[j]=visited;
                }


                if (frequecncy[i]!=visited){
                    frequecncy[i]=count;
                }
            }
        }




        for (int i=0;i<frequecncy.length;i++){
            for (int j=i+1;j<frequecncy.length;j++){
                if (frequecncy[i]<frequecncy[j]){
                    int temp=array[i];

                    array[i]=array[j];
                    array[j]=temp;

                    int tempfreq=frequecncy[i];
                    frequecncy[i]=frequecncy[j];
                    frequecncy[j]=tempfreq;

                }

                else if (frequecncy[i]==frequecncy[j]){

                    if (array[i]>array[j]){
                        int temp=array[i];

                        array[i]=array[j];
                        array[j]=temp;
                    }
                }

            }
        }


System.out.println(array[1]);



    }

}
