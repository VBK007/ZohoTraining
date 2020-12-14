import java.util.Scanner;

public class leftshift {
    public static void main(String[] args) {
        System.out.println("Enter the array element one by one");
        int[] array=new int[5];
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }
        System.out.println("Enter the K position");
        int n=scanner.nextInt();
        for (int i=0;i<n;i++){
            int j;
            int first=array[0];
          for ( j=0;j<array.length-1;j++){
              array[j]=array[j+1];
          }
          array[j]=first;

        }

        System.out.println("The data after reverse");
        for (int i=0;i<array.length;i++){
            System.out.print(" | "+array[i]);
        }

    }

}
