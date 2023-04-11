package Assignment.InventoryManagaement;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items;

    public Inventory() {
        items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void printInventory() {
        for (Item item : items) {
            item.printItemDetails();
            System.out.println();
        }
        System.out.println("Inventory Added \n");

    }

    public void updateItemQuantity(Item item, int quantity) {
        item.setQuantity(quantity);
        System.out.println("Inventory Item Quantity Updated \n");
    }

    public void updateItemPrice(Item item, double price) {
        item.setPrice(price);
        System.out.println("Inventory Item Price Updated \n");

    }
}
