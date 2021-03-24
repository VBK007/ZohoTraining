package com.Tomorowzoho.First10String.Second10;

public class aletantivelysot {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 7, 4, 3, 9};

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        int mid = array.length / 2;
        int s2 = array.length - 1;

        for (int i=0;i<mid;i++){
            if (array.length%2==1){
                System.out.print(" "+array[s2]+" "+array[i]);
                s2--;


                if (i==mid-1){
                    System.out.print(" "+array[s2]);
                }
            }

            else {
                System.out.print(" "+array[s2]+" "+array[i]);
                s2--;
            }




        }


    }

}
