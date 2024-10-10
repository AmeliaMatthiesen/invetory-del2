package items;

public class Player {

    private final String name;
    private final Inventory inventory;

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public String getName() {
        return name;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void buyItem(InventoryItem item, Shop shop) {
        shop.sellItem(item, this);
    }

    public void sellItem(InventoryItem item, Shop shop) {
        inventory.removeItem(item);
        shop.addItem(item);
    }

    public void displayInventory() {
        System.out.println(name + "'s Inventory:");
        inventory.showItems();
    }
}
