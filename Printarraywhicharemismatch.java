package Cryptography;

import java.util.Scanner;

public class Printarraywhicharemismatch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the array data");
        int arraysize=scanner.nextInt();
        String[] firstarray=new String[arraysize];

        System.out.println("Enter the second array size");
        arraysize=scanner.nextInt();
String[] secondarray=new String[arraysize];


System.out.println("Enter the array data  one by one");
for (int i=0;i<arraysize;i++){
    firstarray[i]=scanner.next();
}

System.out.println("Enter the second array data");
for (int j=0;j<arraysize;j++){
    secondarray[j]=scanner.next();
}

for (int i=0;i<arraysize;i++){
    if (!firstarray[i].equals(secondarray[i])){
        System.out.println("  " +firstarray[i]+ " "+secondarray[i]+ " , ");
    }
}



    }



}
