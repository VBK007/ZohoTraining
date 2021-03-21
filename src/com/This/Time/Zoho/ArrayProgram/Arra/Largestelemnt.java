package com.This.Time.Zoho.ArrayProgram.Arra;

public class Largestelemnt {
    public static void main(String[] args) {
        int[] array={30,2,666,5,46,55};
        int largest=array[0];

        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if (largest<array[j]){
                    largest=array[j];
                }
            }

        }

        System.out.println("The biggest number is "+largest);





    }
}
