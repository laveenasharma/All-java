abstract class Bank{
    abstract float calculateROI();
    //In abstract class we just create the framework and declare its values in the extended classes.
    // We can use the Abstract method in only Abstract classes.
}

class ICICIBank extends Bank{
    float calculateROI(){
        return 8;
    }
}

class HDFCBank extends Bank{
    float calculateROI(){
        return 9;
    }
}

class Abstarction{
    public static void main(String[] args) {
        Bank b1; // created the object of Bank class 
        b1= new HDFCBank();// as we cannot create the object of abstract class, we call the inherited class to initialize the object of abstract class.
        System.out.println(b1.calculateROI());

        Bank b2= new ICICIBank();
        System.out.println(b2.calculateROI());
    }
}