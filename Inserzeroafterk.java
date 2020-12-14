import java.util.Scanner;

public class Inserzeroafterk {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number of bits");
        int noofbits=scanner.nextInt();

        int[] array=new int[20];
        for (int i=0;i<noofbits;i++){
            array[i]=scanner.nextInt();
        }

        System.out.println("Enter the consective ones ");
        int k=scanner.nextInt();
int count=0;
        for (int i=0;i<array.length;i++){

            if (array[i]==1){
                count++;


            }

            else {
                count=0;
            }

            if (count==k){
                noofbits++;
                for (int j=array.length-1;j>i;j--){
                    array[j]=array[j-1];
                }

                array[i+1]=0;
            }


        }





        for (int i=0;i<noofbits;i++){
            System.out.print(" "+array[i]);
        }

    }


}
