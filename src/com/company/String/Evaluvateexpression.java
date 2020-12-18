package com.company.String;

import java.util.Scanner;

public class Evaluvateexpression {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();

        int val=values(input.charAt(0));
        int res=0;
        res=val;

        for (int i=1;i<input.length()-1;i+=2){
            char opr=input.charAt(i);
           char operanmd=input.charAt(i+1);

            if (isOperand( operanmd)){


                if (opr=='+'){
                    res+=values(operanmd);

                }
                else if (opr=='-'){
                    res-=values(operanmd);
                }
                else if (opr=='*'){
                    res*=values(operanmd);
                }
                else if (opr=='/'){
                    res/=values(operanmd);
                }
                else if (opr=='!'){
                    res=findfactorial(res);
                }


            }
            if (opr=='!'){
                res=findfactorial(res);
            }




        }


       System.out.println(res);


    }

    private static int findfactorial(int i) {



              if (i>1){

                  return i*findfactorial(i-1);
              }

return i;

    }

    private static boolean isOperand(char charAt) {
      return (charAt>='0'&& charAt<='9');
    }

    private static int values(char charAt) {
        return (int) (charAt-'0');
    }


}
