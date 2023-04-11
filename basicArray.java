import java.util.ArrayList;
import java.util.Arrays;

public class basicArray {
    public static void main(String[] args) {
       int[] numbers;
       numbers= new int[6];
       int value=78;
       for(int i=0;i<numbers.length;i++){
        numbers[i]=value++;
        System.out.println(numbers[i]);
       }
       int[] arr={34,56,76,58,98,67};
       System.out.println(arr[4]);

       ArrayList<Integer> List = new ArrayList<Integer>(Arrays.asList(arr));
       List.add(54);
       arr=List.toArray(arr);
       System.out.println(arr[2]);
    }
}
