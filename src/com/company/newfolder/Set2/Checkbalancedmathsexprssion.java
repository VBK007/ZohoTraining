package com.company.newfolder.Set2;

import java.util.Scanner;
import java.util.SimpleTimeZone;
import java.util.Stack;

public class Checkbalancedmathsexprssion {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner scanner=new Scanner(System.in);
        String mathsexpression=scanner.nextLine();

        boolean res=checkValid(mathsexpression.toCharArray());
        if (res){
            System.out.println("Valid");
        }
        else {
            System.out.println("False");
        }



    }

    static boolean checkValid(char[] array){
//        int i,j=equ.length;
//        Stack<Character> astack=new Stack<>();
//        if(j==0)return false;
//
//        for(i=0;i<j;i++){
//            // System.out.println("?"+equ[i]);
//            if(isOpen(equ[i])){
//                if(!astack.isEmpty() && isNumber(astack.peek())){
//                    return false;
//                }
//                astack.push(equ[i]);
//            }else if(isNumber(equ[i])){
//                astack.push(equ[i]);
//            }else if(isOp(equ[i])){
//                if(astack.isEmpty() || !isNumber(astack.peek())){
//                    return false;
//                }
//                astack.push(equ[i]);
//            }else if(isClose(equ[i])){
//                if(astack.isEmpty() || !isNumber(astack.peek())){
//                    return false;
//                }
//                while(!astack.isEmpty()){
//                    char temp=astack.pop();
//                    if(isOpen(temp)){
//                        if(doMatch(temp,equ[i])){
//                            break;
//                        }else{
//                            return false;//unexpected open
//                        }
//                    }else{
//                        if(astack.isEmpty()){
//                            return false;
//                        }
//                    }
//                }
//                astack.push('1');
//            }else{ //unexpected char
//                return false;
//            }
//        }
//        if(!astack.isEmpty() && !isNumber(astack.peek())) {
//            return false;
//        }
//        while(!astack.isEmpty()){
//            if(isOpen(astack.pop()))return false;
//        }
        int count=0;
        int i;
        for (i=0;i<array.length-1;i++){

            if (array[i]=='(' && ischar(array[i+1])){
                System.out.println(array[i+1]);
                System.out.println("| "+count);
                count++;
                System.out.println("| |"+count);

            }
            else if (array[i]==')'){
                System.out.println("| "+count);
                count--;
                System.out.println("|_|"+count);

            }
            else if (isOp(array[i])){
System.out.println(array[i]+" ");
                if (!ischar(array[i-1])&&ischar(array[i+1])){
                    break;
                }

            }



        }








        return i== array.length&&count==0;
    }

    private static boolean isOpen(char c) {
        if(c=='(' || c=='[')return true;
        return false;
    }

    private static boolean ischar(char c){
        if (c<='a'||c>='z')return true;
        return false;
    }

    private static boolean isNumber(char c) {
        if(c>='0' && c<='9')return true;
        return false;
    }

    private static boolean isOp(char c) {
        if(c=='+' || c=='-' || c=='*' || c=='/')return true;
        return false;
    }

    private static boolean isClose(char c) {
        if(c==')' || c==']')return true;
        return false;
    }

    private static boolean doMatch(char temp, char c) {
        if((temp=='(' && c==')')||(temp=='[' && c==']'))return true;
        return false;
    }


}
