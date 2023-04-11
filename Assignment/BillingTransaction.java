import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BillingTransaction {
    public static void main(String[] args) {
        String csvFile = "customer.csv";
        String line = "";
        String csvSplitBy = ",";
        int totalTransactions = 0;
        double totalBillAmount = 0;
        double maxBillAmount = 0;
        double minBillAmount = Double.MAX_VALUE;
        double billAmount;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] transaction = line.split(csvSplitBy);
                totalTransactions++;
                billAmount = Double.parseDouble(transaction[3]);
                totalBillAmount += billAmount;
                if (billAmount > maxBillAmount) {
                    maxBillAmount = billAmount;
                }
                if (billAmount < minBillAmount) {
                    minBillAmount = billAmount;
                }
            }
            System.out.println("Total number of transactions: " + totalTransactions);
            System.out.println("Total bill amount: " + totalBillAmount);
            System.out.println("Maximum bill amount: " + maxBillAmount);
            System.out.println("Minimum bill amount: " + minBillAmount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
