package com.company.String;

import java.util.Arrays;
import java.util.Scanner;

public class NMmatrix {
    public static void main(String[] args) {

        System.out.println("Enter the matrix size ");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();

        char[][] array=new char[number][number];
        int row=number;
        int col=array[0].length;

        System.out.println("Enter the array one by one");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                array[i][j]=scanner.next().charAt(0);
            }
        }

for (int i=0;i<array.length;i++){
    System.out.println(Arrays.toString(array[i]));
}



for (int i=0;i<row;i++){
    for (int j=0;j<col;j++){
        if (j==0||i==row-1&&j==col-1){

            if (array[i][j]!='0'){
                array[i][j]='_';
            }
        }
        if (j>0){

            for (int k=j+1;k<col;k++){
                if (array[i][j]=='1' && array[i][k]=='1'){
                    array[i][j]='_';

                    if (j==col-2){
                        array[i][col-1]='_';
                    }


                }
            }




        }
    }
}
System.out.println("After swapping");

        for (int i=0;i<array.length;i++){
            System.out.println(Arrays.toString(array[i]));
        }




    }
}
