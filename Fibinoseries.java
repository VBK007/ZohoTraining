import java.util.Arrays;
import java.util.Scanner;

public class Fibinoseries {
    public static void main(String[] args) {

        System.out.println("Enter the array size");
        Scanner scanner=new Scanner(System.in);
        int arraysize=scanner.nextInt();
        int[] array=new int[arraysize];
        for (int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }
        Arrays.sort(array);

        int[] fibinoseties=new int[40];
        int n1=0,n2=1;
        for (int i=2;i<fibinoseties.length;i++){
            fibinoseties[0]=0;
            fibinoseties[1]=1;

            int n3=n1+n2;
            fibinoseties[i]=n3;
            n1=n2;
            n2=n3;


        }



        for (int i=0;i<fibinoseties.length-1;i++)

{
    System.out.print(" | "+fibinoseties[i]);
}


        System.out.println();

        for (int i=0;i<array.length;i++){
            for (int j=0;j<fibinoseties.length;j++){
                if (array[i]==fibinoseties[j]){
                    System.out.println(" "+array[i]);
                }
            }

        }


    }

}
