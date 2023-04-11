// int var1
// The final field FinalNEWEx.var1 cannot be assignedJava(33554512)

public class FinalNEWEx {
    final int var1=10;
    void display(){
        var1=100;
        System.out.println(var1);
    }
    public static void main(String[] args) {
        FinalNEWEx f1=new FinalNEWEx();
        f1.display();
    }
}
