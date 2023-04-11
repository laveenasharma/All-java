package BankingManagement.src;
//Nested classes

public class homepage {

    class details {
        String Name;
        int AccNumber;
        int AvaBalance;

        public details(String Nm, int AccNo, int AvBal) {
            this.Name = Nm;
            this.AccNumber = AccNo;
            this.AvaBalance = AvBal;
        }

        public int deposite() {
            return (this.AvaBalance += 100000);
        }
    }

    public static void main(String[] args) {
        homepage hp=new homepage();
        homepage.details user1=hp.new details("Laveena", 765998, 754637);
        System.out.println(user1.deposite());
        System.out.println(user1.AccNumber);
    }
}
