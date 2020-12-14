package Cryptography;

import java.util.Scanner;

public class Contiguoussubarray {

    public static void main(String[] args) {

        System.out.println("Enter the array element Size");
        Scanner scanner=new Scanner(System.in);
        int arraysize=scanner.nextInt();
        int[] array=new int[arraysize];

        System.out.println("Enter the Array elements one by one");
        for (int i=0;i<arraysize;i++){
            array[i]=scanner.nextInt();
        }

        int statrtindex=0;
        int end=0;
        int max_from_end=0;
        int max_from_statr=0;
int beg=0;


        for (int i=0;i<arraysize;i++){
            max_from_end=max_from_end+array[i];

            if (max_from_end<0){
                max_from_end=0;
                beg=i+1;
            }


            if (max_from_statr<max_from_end){
                max_from_statr=max_from_end;
                statrtindex=beg;
                end=i;
            }

        }



        for (int i=statrtindex;i<=end;i++){
            System.out.print(" "+array[i]);
        }



    }

}
