package test; // Rätt paketnamn

import items.Inventory; // Lägg till denna import
import items.weapons.BigSword;

public class testInventory { 

    public static void main(String[] args) {
        // Skapa ett inventarie
        Inventory inventory = new Inventory();

        // Skapa ett föremål av BigSword
        BigSword bigSword = new BigSword("Stort svärd", 10, 50.0, 25, 1);

        // Lägg till BigSword i inventariet
        inventory.addItem(bigSword);

        // Testa att visa inventariets innehåll
        System.out.println("Inventariets innehåll efter att ha lagt till ett svärd:");
        inventory.showItems(); // Denna metod ska skrivas i Inventory-klassen

        // Anropa metoder på BigSword
        System.out.println("Attackerar med svärdet:");
        bigSword.meleeAttack();  // Anta att denna metod finns
        bigSword.bigSwingAttack(); // Anta att denna metod finns

        // Ta bort svärdet från inventariet
        inventory.removeItem(bigSword); // Denna metod ska skrivas i Inventory-klassen
        System.out.println("Inventariets innehåll efter att ha tagit bort svärdet:");
        inventory.showItems();
    }
}
