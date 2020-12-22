package com.company.newfolder.Set3;

import java.util.*;

public class oddelemeninascendingandevenposition {

    public static void main(String[] args) {
        System.out.println("Enter the array element size");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] a = new int[number];

        System.out.println("Enter the elemnt one by one");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(a));
int n=a.length;
int i,j;

        for(i=0;i<n-1;i++)

            for(j=i+1;j<n;j++)
            {
                if(i%2==0)
                {
                    if(a[i]<a[j])


                        a[i]=a[i]+a[j]-(a[j]=a[i]);

                }
                else
                {
                    if(a[i]>a[j])
                        a[i]=a[i]+a[j]-(a[j]=a[i]);
                }
            }

        System.out.println(Arrays.toString(a));


}




}
