package items;

import java.util.ArrayList;

public class Shop {

    private final String name;
    private final ArrayList<InventoryItem> items;

    public Shop(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addItem(InventoryItem item) {
        items.add(item);
        System.out.println(item.getName() + " har lagts till i affären.");
    }

    public void sellItem(InventoryItem item, Player player) {
        if (items.contains(item)) {
            items.remove(item);
            player.getInventory().addItem(item);
            System.out.println(player.getName() + " har köpt " + item.getName() + " från " + name + ".");
        } else {
            System.out.println("Föremålet finns inte i affären.");
        }
    }
}
