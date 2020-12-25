package com.revise.Array;

import java.util.Scanner;

public class findfrequencyofeachelement {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the Arraysize");
        int arraysize=scanner.nextInt();
        System.out.println("Enter the array data one by one");
        int[] array=new int[arraysize];
        for (int i=0;i<arraysize;i++){
            array[i]=scanner.nextInt();
        }

        System.out.println();
int visirted=-1;
int[] frequency=new int[arraysize];


for (int i=0;i<arraysize;i++){
    if (array[i]!=visirted){
        int j;
        int count=1;
        for (j=i+1;j<arraysize;j++){
            if (array[i]==array[j]){
                count++;
                frequency[j]=visirted;

            }
        }

        if (frequency[i]!=visirted){
            frequency[i]=count;
        }


    }
}



System.out.println("Elements of array"+" "+"Frequency of Elements ");

for (int i=0;i<frequency.length;i++){

if (frequency[i]!=visirted){
    System.out.println(" "+array[i]+" "+frequency[i]);
}


}



    }

}
