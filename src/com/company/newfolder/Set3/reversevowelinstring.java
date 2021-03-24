package com.company.newfolder.Set3;

import java.util.Arrays;
import java.util.Scanner;

public class reversevowelinstring {

    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        char[] ch=input.toCharArray();
     makereverse(ch,ch.length);
        System.out.println(Arrays.toString(ch));
    }

    private static char[] makereverse(char[] ch, int length) {
        int start=0;
        for (int end=0;end<ch.length;end++){
        if (ch[end]==' '){
            reverseword(ch,start,end);
            start=end+1;
        }

        }

        reverseword(ch,start,length-1);



        reverseword(ch,0,length-1);

    return ch;

    }

    private static void reverseword(char[] ch, int start, int end) {
        while (start<=end){
            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }


    }


}
