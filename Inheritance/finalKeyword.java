//Error message
//void Final.display()
//Cannot override the final method from FinalExampleJava(67109265)
class FinalExample{
    final int var1;
    FinalExample(){
        var1=25;// blank final variable is variable which is initailized using final keyword but declared in constructor
    }
    void display(){
        System.out.println("Parent class");
    }
}

class Final extends FinalExample{
    int var1=35;
    void display(){
        System.out.println("Child class");
    }
}

public class finalKeyword {
    public static void main(String[] args) {
        Final f1= new Final();
        System.out.println(f1.var1);
    }
}
