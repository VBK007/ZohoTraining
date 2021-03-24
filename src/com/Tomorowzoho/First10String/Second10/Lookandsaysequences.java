package com.Tomorowzoho.First10String.Second10;

public class Lookandsaysequences {
    public static void main(String[] args) {
        int n=10;

           retuenSgring(n);





    }

    private static void retuenSgring(int n) {
        String result="1";
        int i=1;
System.out.println(result);
        while (i<n){
            int count=1;
            StringBuilder sb=new StringBuilder();
            for (int j=1;j<result.length();j++){
                if (result.charAt(j)==result.charAt(j-1)){
                   count++;
                }
                else {
                    sb.append(count);
                    sb.append(result.charAt(j-1));
                  count=1;
                }

            }

            sb.append(count);
            sb.append(result.charAt(result.length()-1));
            result=sb.toString();
            System.out.println(result);
            i++;



        }



    }
}
