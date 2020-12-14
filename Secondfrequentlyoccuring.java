import java.util.Arrays;
import java.util.Scanner;

public class Secondfrequentlyoccuring {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the array size");
        int arrayusize=scanner.nextInt();
        System.out.println("Enter the array element one by one");
        int[] array=new int[arrayusize];

        for (int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }

        System.out.println();

        int[] frequency=new int[array.length];

        int visited=-1;
        for (int i=0;i<array.length;i++){
  int count=1;
            for (int j=i+1;j<array.length;j++){
                if (array[i]==array[j]){
                    count++;
                    frequency[j]=visited;

                }

            }
            if (frequency[i]!=visited){
                frequency[i]=count;
            }


        }


        for (int i=0;i<frequency.length;i++){
           if (frequency[i]!=visited){
               System.out.println(" | "+array[i]+ " " +frequency[i]);

           }
        }




    }

}
