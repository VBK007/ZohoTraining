import java.util.Arrays;
import java.util.Scanner;

public class Displaynonelementindex {

    public static void main(String[] args) {
        System.out.println("Enter the array elemet size");
        Scanner scanner=new Scanner(System.in);
        int firstsize=scanner.nextInt();
        int[] firstarray=new int[firstsize];

        System.out.println("Enter the Second array size");
        int secondarraysize=scanner.nextInt();

        int[] secondarray=new int[secondarraysize];
        System.out.println("Enter the array data one by one");

        for (int i=0;i<firstarray.length;i++){
            firstarray[i]=scanner.nextInt();
        }

        System.out.println("Enter the second array data one by one");
        for (int i=0;i<secondarray.length;i++){
            secondarray[i]=scanner.nextInt();
        }


        methodprintIndex(firstarray,secondarray);






    }

    private static void methodprintIndex(int[] firstarray, int[] secondarray) {
        int element=0;
        for (int i=0;i<secondarray.length;i++){

            if (firstarray[i]!=secondarray[i]){
                element=firstarray[i];
                firstarray[i]++;
            }
            else {
                secondarray[i]++;
            }


        }

        System.out.println("The array elemet is "+element);




    }


}
