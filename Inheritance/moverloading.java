class methodoverloading {
    public void add(int x, int y) {
        int sum = x + y;
        System.out.println("Sum of integer numbers: " + sum);
    }

    public void add(float x, float y) {
        float sum = x + y;
        System.out.println("Sum of float numbers: " + sum);
    }

    public void add(int x) {
        System.out.println("Single integer number: " + x);
    }
}

public class moverloading {
    public static void main(String args[]) {
        methodoverloading Obj = new methodoverloading();
        Obj.add(55.6f, 23.9f);
        Obj.add(1996);
        Obj.add(99, 53);
    }
}
