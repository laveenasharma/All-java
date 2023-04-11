import java.util.Scanner;

public class evenMultiple {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please Enter number");
        int number= input.nextInt();
        int result;
        System.out.println("EVEN MULTIPLE OF "+number);
        for(int x=1; x<=20; x+2){
            // if(x%2==0){
            result=number*x;
            System.out.println(number+" X "+x+" = "+result);
            // }
        }
    }

}
