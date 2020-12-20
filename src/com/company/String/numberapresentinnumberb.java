package com.company.String;

import java.util.Scanner;

public class numberapresentinnumberb {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        System.out.println("Enter the key");
        int key=scanner.nextInt();

        String num=String.valueOf(number);
        String ke=String.valueOf(key);

        int res=0;
        for (int i=0;i<ke.length();i++){
            for (int j=0;j<num.length();j++){
                if (ke.charAt(i)!=num.charAt(j)){
                    res=1;

                }
                else {
                    res=0;
                    break;
                }
            }
        }

if (res==0){
    System.out.println("Yes found");
}
else {
    System.out.println("No found");
}
    }
}
