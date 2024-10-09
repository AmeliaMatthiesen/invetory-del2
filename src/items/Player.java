package items; 

public class Player {
    private final String name; // Spelarens namn
    private final Inventory inventory; // Spelarens inventarie

    public Player(String name) {
        this.name = name; // Sätt spelarens namn
        this.inventory = new Inventory(); // Initiera inventariet
    }

    public String getName() {
        return name; 
    }

    public Inventory getInventory() {
        return inventory; 
    }

    // Metod för att köpa ett föremål från en affär
    public void buyItem(InventoryItem item, Shop shop) {
        shop.sellItem(item, this); // Anropa sälja-funktion i affären för att genomföra köpet
    }

    // Metod för att sälja ett föremål till en affär
    public void sellItem(InventoryItem item, Shop shop) {
        inventory.removeItem(item); // Ta bort föremålet från spelarens inventarie
        shop.addItem(item); // Lägg till föremålet i affären
    }

    // Metod för att visa spelarens inventarie
    public void displayInventory() {
        System.out.println(name + "'s Inventory:"); 
        inventory.showItems(); // Visa innehållet i spelarens inventarie
    }
}
