public class multiInherit {
    class X {
        public void methodX() {
            System.out.println("Class X method");
        }
    }

    class Y extends X {
        public void methodY() {
            System.out.println("class Y method");
        }
    }

    class Z extends Y {
        public void methodZ() {
            System.out.println("class Z method");
        }
    }

    public static void main(String args[]) {
        multiInherit mainObj= new multiInherit();
        multiInherit.Z obj= mainObj.new Z();
        obj.methodX();
        obj.methodY();
        obj.methodZ();
    }
}