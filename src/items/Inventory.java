package items;

import java.util.ArrayList;

public class Inventory {

    private final ArrayList<InventoryItem> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void addItem(InventoryItem item) {
        items.add(item);
        System.out.println(item.getName() + " har lagts till i inventariet.");
    }

    public void removeItem(InventoryItem item) {
        if (items.remove(item)) {
            System.out.println(item.getName() + " har tagits bort från inventariet.");
        } else {
            System.out.println(item.getName() + " finns inte i inventariet.");
        }
    }

    public void showItems() {
        if (items.isEmpty()) {
            System.out.println("Inventariet är tomt.");
        } else {
            System.out.println("Inventariets innehåll:");
            for (InventoryItem item : items) {
                System.out.println("- " + item.getName());
            }
        }
    }
}
