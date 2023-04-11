public class factorial {
    public static void main(String[] args) {
        int num=5;
        int result=1;
        for(int x=1;x<=num;x++){
            result=result*x;
        }
        System.out.println("Factorial of "+ num+" is "+ result);
    }
}
