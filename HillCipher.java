import java.util.Scanner;

public class HillCipher {
    public static void main(String[] args) {
        System.out.println("Enter the plain text");
        Scanner scanner=new Scanner(System.in);
        String messgae=scanner.next();
        System.out.println("Enter the Message key");
        String key=scanner.next();
        hillCipher(messgae,key);

    }

    private static void hillCipher(String messgae, String key) {
        int[][] keymatrix=new int[3][3];

        getKeymatrix(key,keymatrix);






    }

    private static void getKeymatrix(String key, int[][] keymatrix) {
        int k=0;
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                keymatrix[i][j]=(key.charAt(k))%65;
                k++;

            }

        }

    }


}
