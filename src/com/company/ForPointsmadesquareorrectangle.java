package com.company;

import java.util.Scanner;

public class ForPointsmadesquareorrectangle {
    public static void main(String[] args) {
        System.out.println("Enter the Four points");
        Scanner scanner=new Scanner(System.in);
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();
        int n3=scanner.nextInt();
        int n4=scanner.nextInt();

        boolean isRectangle=methodRectangle(n1,n2,n3,n4);
        if (isRectangle){
            System.out.println("It is Able to print Rectangle");

        }
        else {
            System.out.println("Not able to print");
        }


    }

    private static boolean methodRectangle(int n1, int n2, int n3, int n4) {
    if (n1==n2&&n1==n3&&n1==n4&&n2==n3&&n2==n4&&n3==n4)
    {
        return true;
    }
else if (n1==n3&&n2==n4){
    return true;

    }

else if (n1==n4&&n2==n3){
    return true;
    }

    return false;
    }


}
