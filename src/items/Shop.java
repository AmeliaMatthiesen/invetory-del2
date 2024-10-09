package items; 

import java.util.ArrayList; 

// Shop-klassen representerar en affär där spelare kan köpa och sälja föremål
public class Shop {

    private final String name; 
    private final ArrayList<InventoryItem> items; // Lista över föremål i affären

    public Shop(String name) {
        this.name = name; 
        this.items = new ArrayList<>(); // Initiera listan med föremål
    }

    public String getName() {
        return name; 
    }

    // Metod för att lägga till ett föremål i affären
    public void addItem(InventoryItem item) {
        items.add(item); // Lägg till föremål i affären
        System.out.println(item.getName() + " har lagts till i affären."); // Bekräftelsemeddelande
    }

    // Metod för att sälja ett föremål till en spelare
    public void sellItem(InventoryItem item, Player player) {
        // Kontrollera om föremålet finns i affären
        if (items.contains(item)) {
            items.remove(item); // Ta bort föremålet från affären
            player.getInventory().addItem(item); // Lägg till föremålet i spelarens inventarie
            // Bekräftelsemeddelande om köpet
            System.out.println(player.getName() + " har köpt " + item.getName() + " från " + name + ".");
        } else {
            System.out.println("Föremålet finns inte i affären."); // Meddelande om att föremålet inte finns
        }
    }
}
