import java.util.*;

public class frequencytype {

    public static void main(String[] args) {
        String arrayelements = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size");
        int arraysize = scanner.nextInt();
        System.out.println("Enter the array data one by one");
        int[] array = new int[arraysize];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println();
        System.out.println("Your real Arrays is ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(" | " + array[j]);
        }

        System.out.println();


//        ArrayList<Map.Entry <Integer,Integer>> list=new ArrayList<>(elemtcount.entrySet());
//
//        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>()
//                {
//                    @Override
//                    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
//                        return o2.getValue().compareTo(o1.getValue());
//                    }
//
//                }
//        );
//
//        for (Map.Entry<Integer,Integer> entry:list){
//            int frequency=entry.getValue();
//            while (frequency>=1){
//                System.out.print(entry.getValue()+" ");
//                frequency--;
//            }
//        }
//


        int[] frequency = new int[array.length];

        int visited = -1;

        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] == array[j]) {
                    count++;
                    frequency[j] = visited;
                }
                if (frequency[i] != visited) {
                    frequency[i] = count;
                }

            }


        }

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (frequency[i] < frequency[j]) {

                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                    int freqtemp = frequency[i];
                    frequency[i] = frequency[j];
                    frequency[j] = freqtemp;
                } else if (frequency[i] == frequency[j]) {

                    if (array[i] > array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;

                        int freqtemp = frequency[i];
                        frequency[i] = frequency[j];
                        frequency[j] = freqtemp;
                    }

                }


            }
        }


        System.out.println(array[1]);

//        System.out.println("After swapping");
//for (int i=0;i<array.length;i++){
//    System.out.println(" "+array[i]+" "+frequency[i]);
//}


//        for (int i = 0; i < frequency.length; i++) {
////    if (frequency[i]!=visited && frequency[i+1]!=visited){
////       if (frequency[i]==frequency[i+1]){
////           if (array[i]<array[i+1]){
////               for (int j=0;j<frequency[i];j++){
////                   System.out.print(" "+array[i]);
////               }
////           }
////           else {
////               for (int j=0;j<frequency[i+1];j++){
////                   System.out.print(" "+array[i+1]);
////               }
////           }
////
////        }
//
//            if (frequency[i] != visited) {
//                for (int j = 0; j < frequency[i]; j++) {
//                    System.out.print(" " + array[i]);
//
//
//                }
//
//
//            }
//
//
//        }


    }
}



