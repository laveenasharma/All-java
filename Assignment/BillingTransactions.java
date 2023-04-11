import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BillingTransactions {

    public static void main(String[] args) {

        // Initialize variables to store results
        int numTransactions = 0;
        double totalBillAmount = 0;
        double maxBillAmount = Double.MIN_VALUE;
        double minBillAmount = Double.MAX_VALUE;

        // Specify the path and name of the CSV file
        String csvFile = "customer.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            String line;
            // Skip the header line of the CSV file
            br.readLine();

            while ((line = br.readLine()) != null) {

                // Split each line of the CSV file into individual values
                String[] values = line.split(",");

                // Parse the bill amount from the CSV file
                double billAmount = Double.parseDouble(values[3]);

                // Increment the number of transactions
                numTransactions++;

                // Add the bill amount to the total
                totalBillAmount += billAmount;

                // Check if the bill amount is greater than the current maximum
                if (billAmount > maxBillAmount) {
                    maxBillAmount = billAmount;
                }

                // Check if the bill amount is less than the current minimum
                if (billAmount < minBillAmount) {
                    minBillAmount = billAmount;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Output the results
        System.out.println("Total number of transactions: " + numTransactions);
        System.out.println("Total bill amount: $" + totalBillAmount);
        System.out.println("Maximum bill amount: $" + maxBillAmount);
        System.out.println("Minimum bill amount: $" + minBillAmount);
    }
}
