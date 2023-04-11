interface shape{
    void draw();
    int area(int l,int b);

}

class Rectangle implements shape{

    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println("Rectangle has been drawn");
    }

    @Override
    public int area(int l, int b) {
        // TODO Auto-generated method stub
        return l*b;
    }
    
}
public class Interfaces {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.draw();
        System.out.println(r1.area(5, 7));
    }
    
}
