import java.util.Scanner;

public class InventoryManagement{
    public static void main(String[] args) {
        String[] products = {"TV", "Mobile", "Laptop", "Speaker", "Headphones"};
        int[] counts = {10, 15, 20, 5, 8};
        double[] costs = {50000.0, 20000.0, 40000.0, 5000.0, 3000.0};
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n----- Inventory Management System Menu -----");
            System.out.println("1. Product List");
            System.out.println("2. Product Count");
            System.out.println("3. View Product Details");
            System.out.println("4. Edit Product");
            System.out.println("5. Update Inventory");
            System.out.println("0. Exit");
            
            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("\n----- Product List -----");
                    for (int i = 0; i < products.length; i++) {
                        System.out.println((i + 1) + ". " + products[i]);
                    }
                    break;
                    
                case 2:
                    System.out.println("\n----- Product Count -----");
                    System.out.print("Enter the product index: ");
                    int index = scanner.nextInt();
                    if (index > 0 && index <= products.length) {
                        System.out.println("Count of " + products[index - 1] + " is " + counts[index - 1]);
                    } else {
                        System.out.println("Invalid product index.");
                    }
                    break;
                    
                case 3:
                    System.out.println("\n----- View Product Details -----");
                    System.out.print("Enter the product index: ");
                    index = scanner.nextInt();
                    if (index > 0 && index <= products.length) {
                        System.out.println("Product: " + products[index - 1]);
                        System.out.println("Count: " + counts[index - 1]);
                        System.out.println("Cost: " + costs[index - 1]);
                    } else {
                        System.out.println("Invalid product index.");
                    }
                    break;
                    
                case 4:
                    System.out.println("\n----- Edit Product -----");
                    System.out.print("Enter the product index: ");
                    index = scanner.nextInt();
                    if (index > 0 && index <= products.length) {
                        System.out.println("Enter the new details:");
                        System.out.print("Product name: ");
                        scanner.nextLine();
                        products[index - 1] = scanner.nextLine();
                        System.out.print("Count: ");
                        counts[index - 1] = scanner.nextInt();
                        System.out.print("Cost: ");
                        costs[index - 1] = scanner.nextDouble();
                        System.out.println("Product details updated successfully.");
                    } else {
                        System.out.println("Invalid product index.");
                    }
                    break;
                    
                case 5:
                    System.out.println("\n----- Update Inventory -----");
                    System.out.print("Enter the product index: ");
                    index = scanner.nextInt();
                    if (index > 0 && index <= products.length) {
                        System.out.print("Enter the quantity to add/subtract: ");
                        int quantity = scanner.nextInt();
                        counts[index - 1] += quantity;
                        System.out.println("Inventory updated successfully.");
                    } else {
                        System.out.println("Invalid product index.");
                    }
                    break;
                    
                case 0:
                    System.out.println("\nExiting Inventory Management System. Goodbye!");
                    scanner.close();
            }
        }
    }
}
                