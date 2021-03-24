package com.Tomorowzoho.First10String.Second10;

public class alertnato {
    public static void main(String[] args) {
        int[] array={2,3,7,1,8,5,11};
        int min=0;
        int max=0;
        for (int i=0;i<array.length;i++){
             min=array[i];
            for (int j=0;j<array.length;j++){
                 max=array[j];
                if (max>min) {
                    for (int k = 0; k < array.length; k++) {
                   if (array[k]>min&& array[k]<max){
                       max=array[k];
                   }

                    }

                }

            }

            if (min!=max){
                System.out.print(" "+min+" > "+max+", ");
            }
            else {
                System.out.print(" "+min);
            }





        }


    }
}
