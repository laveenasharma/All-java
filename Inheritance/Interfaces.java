interface shapes {
    void draw();
    int area(int l, int b);


}
class rectangle implements shapes{
    public void draw(){
        System.out.println("The rectangle has been drawn");

    }
    public int area(int l, int b){
        return l*b;
    }
}
public class Interfaces {
    public static void main(String[] args) {
        rectangle obj1 = new rectangle();
        obj1.draw();
        //obj1.area(10, 20);
        System.out.println(obj1.area(10, 20));
    }
}
