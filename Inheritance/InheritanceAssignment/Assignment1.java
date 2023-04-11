import java.util.*;

class Product {
    private String name;
    private String specification;
    private double cost;
    private int count;

    public Product(String name, String specification, double cost, int count) {
        this.name = name;
        this.specification = specification;
        this.cost = cost;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public String getSpecification() {
        return specification;
    }

    public double getCost() {
        return cost;
    }

    public int getCount() {
        return count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

class InventoryManagementSystem {
    private List<Product> productList;

    public InventoryManagementSystem() {
        productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(Product product) {
        productList.remove(product);
    }

    public List<Product> getProductList() {
        return productList;
    }

    public int getProductCount(String productName) {
        for (Product product : productList) {
            if (product.getName().equals(productName)) {
                return product.getCount();
            }
        }
        return 0;
    }

    public void updateProductDetails(String productName, String specification, double cost, int count) {
        for (Product product : productList) {
            if (product.getName().equals(productName)) {
                product.setSpecification(specification);
                product.setCost(cost);
                product.setCount(count);
            }
        }
    }

    public void updateProductCount(String productName, int count) {
        for (Product product : productList) {
            if (product.getName().equals(productName)) {
                product.setCount(product.getCount() + count);
            }
        }
    }
}

public class Assignment1 {
    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();

        Product p1 = new Product("Laptop", "Dell Inspiron 15 5000 Series", 45000.00, 10);
        Product p2 = new Product("Mobile", "Samsung Galaxy S21 Ultra", 100000.00, 5);
        Product p3 = new Product("Tablet", "Apple iPad Pro 12.9 inch", 80000.00, 8);

        ims.addProduct(p1);
        ims.addProduct(p2);
        ims.addProduct(p3);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Product List");
            System.out.println("2. Product Count");
            System.out.println("3. View Product Details");
            System.out.println("4. Edit Product");
            System.out.println("5. Update Inventory");
            System.out.println("6. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    List<Product> productList = ims.getProductList();
                    for (Product product : productList) {
                        System.out.println(product.getName() + " - " + product.getCount() + " available");
                    }
                    break;
                case 2:
                    System.out.println("Enter the product name:");
                    String productName = sc.next();
                    int productCount = ims.getProductCount(productName);
                    System.out.println(productCount + "
