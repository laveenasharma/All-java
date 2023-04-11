package demo;

public class first {
    private double num = 100;
    private int number=20;

    private boolean square() {
        return true;
    }


    public int getNumber(){
        return number;
    }
    public boolean getNum() {
        return square();
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static void main(String args[]) {

        first obj = new first();
        System.out.println(obj.num);
        System.out.println(obj.square(1000));
    }
}
