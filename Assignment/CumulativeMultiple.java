import java.util.Arrays;

public class CumulativeMultiple {
    public static void main(String[] args) {
        int[] arrNum = {5, 3, 4, 2, 0, 8};

        try {
            int product = 1;
            for (int i = 0; i < arrNum.length; i++) {
                product *= arrNum[i];
                arrNum[i] = product;
            }
            System.out.println(Arrays.toString(arrNum));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
