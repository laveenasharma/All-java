class Parentcl{
    int num1;
    int num2;
    public Parentcl(int no1,int no2){
        this.num1=no1;
        this.num2=no2;
    }
    // int num1=10;
    // int num2=100;
    public void add(){
        System.out.println(num1+num2);
    }

}

class childcl extends Parentcl{

    public childcl(){
        super(5,7);
    }
    public void multiply(){
        System.out.println(num1*num2);
    }
}

class inheritance{
    public static void main(String[] args) {
        childcl childObj= new childcl();
        childObj.add();
        childObj.multiply();
    }
}