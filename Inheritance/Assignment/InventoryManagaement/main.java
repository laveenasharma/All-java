package Assignment.InventoryManagaement;

public class main {
    public static void main(String[] args) {
        Item item1 = new Item("Laptop", 5, 1000.0);
        Item item2 = new Item("Smartphone", 10, 500.0);

        Inventory inventory = new Inventory();
        System.out.println("Inventory Added");
        inventory.addItem(item1);
        inventory.addItem(item2);

        inventory.printInventory();

        Item item3 = new Item("Tablet", 3, 300.0);
        inventory.addItem(item3);

        inventory.updateItemQuantity(item1, 10);
        inventory.updateItemPrice(item2, 600.0);

        inventory.removeItem(item3);

        inventory.printInventory();
    }
}
