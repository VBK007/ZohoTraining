package Cryptography;

import java.util.Scanner;

public class threashold {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the array elements size");
        int arraysize= scanner.nextInt();
        int[] array=new int[arraysize];
        System.out.println("Enter the array data one by one");
        for (int i=0;i<arraysize;i++){
            array[i]=scanner.nextInt();
        }
        System.out.println("Enter the threshold value");
        int threshold=scanner.nextInt();


        int remaindero=0;
        int quoitented=0;
        int count=0;
        for (int i=0;i<arraysize;i++){
          quoitented=array[i]/threshold;
          remaindero=array[i]%threshold;

        if (quoitented>0){
            count+=quoitented;
        }
        if (remaindero>0){
            count+=1;
        }


        }
        System.out.println();
        System.out .println("total output count "+ count);








    }

}
