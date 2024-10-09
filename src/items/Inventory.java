package items;

import java.util.ArrayList;

public class Inventory {

    // Deklarerar en lista för att lagra föremål i inventariet
    private final ArrayList<InventoryItem> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void addItem(InventoryItem item) {
        items.add(item);
        System.out.println(item.getName() + " har lagts till i inventariet.");
    }

    // Metod för att ta bort ett föremål från inventariet
    public void removeItem(InventoryItem item) {
        // Försöker ta bort föremålet från listan
        if (items.remove(item)) { // Om föremålet togs bort (fanns i listan)
            System.out.println(item.getName() + " har tagits bort från inventariet.");
        } else { // Om föremålet inte fanns i listan
            System.out.println(item.getName() + " finns inte i inventariet.");
        }
    }

    // Metod för att visa alla föremål som finns i inventariet
    public void showItems() {
        // Kollar om inventariet är tomt
        if (items.isEmpty()) { // Om listan är tom
            System.out.println("Inventariet är tomt."); // Skriver ut att inventariet är tomt
        } else { // Om det finns föremål i inventariet
            System.out.println("Inventariets innehåll:"); // Skriver ut rubrik för inventariets innehåll
            // Loopar igenom varje föremål i listan och skriver ut dess namn
            for (InventoryItem item : items) {
                System.out.println("- " + item.getName()); // Skriver ut namnet på varje föremål
            }
        }
    }
}
