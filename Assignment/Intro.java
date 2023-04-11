// import java.lang.reflect.Constructor;

public class Intro {
    String name;
    int marks;

    public Intro(){
        this("Sample",99);
    }

    public Intro(String nm){
        this(nm,75);
    }

    public Intro(int mrks){
        this("HeroVired",mrks);
    }

    public Intro(String nm, int mrks){
        this.name=nm;
        this.marks=mrks;
        // System.out.println("Constructor has been called");
    }
    
    public void display() {
    System.out.println(this.name +" has secured "+this.marks+ " marks.");
    }
public static void main(String[] args) {
    Intro obj1= new Intro("Laveena", 50);
    obj1.display();

    Intro obj2= new Intro();
    obj2.display();

    Intro obj3= new Intro("Nihaal");
    obj3.display();

    Intro obj4= new Intro(87);
    obj4.display();

}
}