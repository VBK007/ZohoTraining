package com.company;

import java.util.Scanner;

public class DisplayiNdexofnotelmentinarray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the array elemnt size");
        int arraysize1=scanner.nextInt();


        System.out.println("Enter the secound array size");
       int arraysize2=scanner.nextInt();

       if (arraysize1>arraysize2){
           int temp=arraysize1;
           arraysize1=arraysize2;
           arraysize2=temp;
       }

        int[] firatarray=new int[arraysize1];
        int[] secondarray=new int[arraysize2];

        System.out.println("Enter the Array elements one by one max size "+firatarray.length);

for (int i=0;i<firatarray.length;i++){
    firatarray[i]=scanner.nextInt();
}


System.out.println("Enter the second array data one by one "+secondarray.length);
for (int j=0;j<secondarray.length;j++){
    secondarray[j]=scanner.nextInt();
}
int visited=-1;
int[] temparray=new int[secondarray.length];

for (int i=0;i<firatarray.length;i++){
    for (int j=0;j<secondarray.length;j++){
        if (firatarray[i]==secondarray[j]){
            temparray[j]=visited;

        }





    }
}



for (int i=0;i<temparray.length;i++){
    if (temparray[i]!=visited){
        System.out.print(" | "+secondarray[i] + " index "+ (i+1));
    }
}







    }

}
