package com.This.Time.Zoho.ArrayProgram.String.NumbersSng;

public class monodigit {
    public static void main(String[] args) {
        String number = "325725";
        int[] array = new int[number.length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = number.charAt(i) - 48;
        }


        boolean ismono = findmono(array);
        if (ismono) {
            System.out.println("Yes it is monodigit");

        } else {
            System.out.println("Not an Mono digit");
        }


    }

    private static boolean findmono(int[] array) {
        int m = 1, n = 0, l = 0, k = 0, j = 0,i = array.length;
        int[] c=new int[array.length];
        for (k=0;k<3;k++){
            if (k==0){
                c[0]=array[0];
                m=1;
                n=0;
            }
            else if (k==2){
                c[0]=array[0]+array[1];
                m=2;
                n=0;

            }
            else {
                c[0]=array[0]-array[1];
                m=2;
                n=0;
            }
check:
            for (j=m;j<i;j++){
               n++;

               if (c[0]==array[j]){
                   c[n]=array[j]+array[j+1];
                   m=j+1;



               }
               else if (c[0]==array[j]+array[j+1]){
                   c[n]=array[j]-array[j+1];
                   m=j+2;

               }
               else if (c[0]==array[j]-array[j+1]){
                   c[n]=array[j]-array[j+1];
                   m=j+2;
                   break;
               }
               else {
                   l++;
                   break;
               }

            }
            if (m>i-1){
               return true;

            }if (l==3){
                return false;
            }



        }




        return false;
    }
}
