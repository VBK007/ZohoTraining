package com.This.Time.Zoho.ArrayProgram.Arra;

public class SecoundLargest {
    public static void main(String[] args) {
        int[] array = {1, 2, 34, 45, 234, 464, 66};
        int largest = array[0];
        int secoundlargest=array[1];
        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if (largest<array[j]){
                    if (largest<secoundlargest){
                        secoundlargest=largest;
                        largest=array[j];
                    }
                    else {
                        largest=array[j];
                    }


                }


            }
        }



        System.out.println("The secound largest number is"+secoundlargest);




    }
}
