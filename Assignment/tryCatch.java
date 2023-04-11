public class tryCatch {
    public static void main(String[] args) {
        try{
         double a = 23/2;
         System.out.println(a);
        }
        catch(ArithmeticException e){
         System.out.println("Exception has occured with "+ e.getMessage());
        int a = 0/23;
         System.out.println(a);
         //System.out.println("division by zero is not possible!");
        }
        finally{
         System.out.println("End of the program !");
 
        }
 
     }
 
}
