import java.util.Locale;
import java.util.Scanner;

public class Cipherceaser {

    public static void main(String[] args) {
        System.out.println("Enter the charater" );
        Scanner scanner=new Scanner(System.in);
        String mystring=scanner.nextLine();
mystring.toUpperCase();
        System.out.println("Enter the number to shift");
        int shifrt=scanner.nextInt();

       System.out.println(" " +methodShift(mystring,shifrt));

    }

    private static StringBuffer methodShift(String mystring, int shifrt) {

        StringBuffer result=new StringBuffer();
        for (int i=0;i<mystring.length();i++){
            if (Character.isUpperCase(mystring.charAt(i))){
                char ch=(char)(((int)mystring.charAt(i)+shifrt-65)%26+65);

                result.append(ch);
            }
            else if (Character.isLowerCase(mystring.charAt(i))){

                char ch=(char)(((int)mystring.charAt(i)+shifrt-97)%26+97);

                result.append(ch);
            }


        }
        return  result;
    }


}
