package test;

import items.Inventory;
import items.weapons.BigSword; 

public class testInventory {

    public static void main(String[] args) {
        // Skapa ett nytt inventarie
        Inventory inventory = new Inventory();

        // Skapa en instans av BigSword med namn, vikt, värde, skada och attackhastighet
        BigSword bigSword = new BigSword("Stort svärd", 10, 50.0, 25, 1);

        // Lägg till BigSword i inventariet
        inventory.addItem(bigSword);

        // Visa inventariets innehåll efter att ha lagt till svärdet
        System.out.println("Inventariets innehåll efter att ha lagt till ett svärd:");
        inventory.showItems(); 

        // Anropa metoder på BigSword för att utföra attacker
        System.out.println("Attackerar med svärdet:");
        bigSword.meleeAttack();
        bigSword.bigSwingAttack();

        // Ta bort svärdet från inventariet
        inventory.removeItem(bigSword); // Anropa metoden för att ta bort ett föremål från inventariet
        System.out.println("Inventariets innehåll efter att ha tagit bort svärdet:");
        inventory.showItems(); // Visa innehållet i inventariet igen för att bekräfta borttagningen
    }
}
