// package src.JavaPackage;

class parent {
    int a = 100;
    int b = 10;

    // public parent() {
    // System.out.println("hiiiiii parent class constructor");
    // }

    public void display() {
        System.out.println("name: " + a + "id: " + b);
    }

}

class child extends parent {
    // child() {
    // super();
    // System.out.println("hello child class constructor");
    // }

    public void display() {
        System.out.println("no1: " + a + "\nno2: " + b);
    }

    public void newMethod() {
        super.display();
    }
}

public class Inheritance2 {
    public static void main(String[] args) {

        child obj2 = new child();
        obj2.display();
        // obj2.details();
        obj2.newMethod();
    }
}
