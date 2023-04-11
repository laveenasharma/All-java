public class UniqueNumbers {
    public static void main(String[] args) {
        int[] arrNum = {1, 2, 2, 1, 6, 6, 1, 5, 6, 5, 6};
        
        
        int maxNum = arrNum[0];
        for (int i = 1; i < arrNum.length; i++) {
            if (arrNum[i] > maxNum) {
                maxNum = arrNum[i];
            }
        }
        
        // Initialize the frequency array
        int[] frequencyArr = new int[maxNum + 1];
        
        // Iterate over the array and count the frequency of each number
        for (int num : arrNum) {
            frequencyArr[num]++;
        }
        
        // Print the unique numbers and their frequencies
        System.out.println("Unique Numbers and their frequencies =>");
        for (int i = 0; i < frequencyArr.length; i++) {
            if (frequencyArr[i] > 0) {
                System.out.println(i + ": " + frequencyArr[i] + " times");
            }
        }
    }
}
