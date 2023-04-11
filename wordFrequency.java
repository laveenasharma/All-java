import java.util.Arrays;
import java.util.Scanner;

public class wordFrequency {
    public static void main(String[] args)
    {
        System.out.println("Please enter the word: ");
        Scanner scan= new Scanner(System.in);
        String str=scan.nextLine();
        
        String[] arr=str.split(" ");  
        System.out.println("Number of words are" + arr.length);
        int wordCount=1;
        for( int i=0; i<=arr.length-1;i++){
            for(int j=i+1; j<=arr.length-1; j++){
                if(arr[i].equals(arr[j])){
                    wordCount++;
                    arr[j]="0";
                }
            }
            if(arr[i]!="0"){
                System.out.println(arr[i]+ "-"+ wordCount);
                
            }
            wordCount=1;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        String[] arr1= {"abc","ghd","pqr"};
        String[] arr2= new String[5];
        System.arraycopy(arr1, 0, arr2, 0, 2);
        System.out.println(Arrays.toString(arr2));
    }
}
