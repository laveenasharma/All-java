import java.util.ArrayList;
import java.util.Arrays;

public class listConversion {
    public static void main(String[] args) {

        Integer arr[] = { 100, 2, 3, 344, 5, 456 };
        System.out.println("Array:" + Arrays.toString(arr));
        ArrayList<Integer> List = new ArrayList<Integer>(Arrays.asList(arr));
        List.add(7);
        arr = List.toArray(arr);
        System.out.println("Array after adding element: " + Arrays.toString(arr));
        Arrays.sort(arr, 2,5);
        System.out.println(Arrays.toString(arr));
    }
}
