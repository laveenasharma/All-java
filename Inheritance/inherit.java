class parent {
    int a;
    int b;
  
    public parent(int a1, int b1) {
        this.a = a1;
        this.b = b1;
        System.out.println("hiiiiii parent class constructor");
    }
    public void display() {
        System.out.println("name: " + a + "id: " + b);
    }
}

class child extends parent {
    child() {
        super(10, 100);
        System.out.println("hello child class constructor");
    }

    public void details() {
        System.out.println("name: " + a + "id: " + b );
    }
}

public class inherit {
    public static void main(String[] args) {

        child obj2 = new child();
        obj2.display();
        obj2.details();
    }
}

