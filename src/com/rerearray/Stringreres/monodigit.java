package com.rerearray.Stringreres;

import java.util.Scanner;

public class monodigit {
    static Scanner scanner = new Scanner(System.in);
    static int[] a, b;
    static int i, j = 0, k = 0, l = 0, m = 1, n = 0;

    public static void main(String[] args) {
        System.out.println("Enter the String");
        String string = scanner.nextLine();
        a = new int[20];
        b = new int[20];
        char[] ch = string.toCharArray();

        while (a[j] != '\0') {
            b[j] = ch[j] - 48;
            j++;
        }

        for (int k = 0; k < 3; k++) {

            if (k == 0) {
                a[0] = b[0];
                m = 1;
                n = 0;

            }

           else if (k==2){
                a[0]=b[0]+b[1];
            }
           else {
               a[0]=b[0]-b[1];
               m=2;
               n=0;
            }

           check:
            for (j=m;j<ch.length;j++){
                n++;
                if (a[0]==b[j]){
                    a[n]=b[j];
                    m=j+1;
               break;
                }
                else if (a[0]==b[j]+b[j+1]){
                    a[n]=b[j]+b[j+1];
                    m=j+2;
                    break;
                }
                else if (a[0]==b[j]-b[j-1]){
                    a[n]=b[j]-b[j+1];
                    m=j+2;
                    break;
                }
                else {
                    l++;
                    break;
                }


            }


            if (m>i-1){
                System.out.println("Given number is  monodigit");
                for (j=0;j<n+1;j++){
                    System.out.print(" "+a[j]);
                }
            }


        }

        if (l==3){
            System.out.println("It is not monodigit");
        }


    }
}
