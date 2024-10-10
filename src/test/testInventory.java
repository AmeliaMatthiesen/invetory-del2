package test;

import items.Inventory;
import items.weapons.BigSword;

public class testInventory {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        BigSword bigSword = new BigSword("Stort svärd", 10, 50.0, 25, 1);

        inventory.addItem(bigSword);

        System.out.println("Inventariets innehåll efter att ha lagt till ett svärd:");
        inventory.showItems();

        System.out.println("Attackerar med svärdet:");
        bigSword.meleeAttack();
        bigSword.bigSwingAttack();

        inventory.removeItem(bigSword);
        System.out.println("Inventariets innehåll efter att ha tagit bort svärdet:");
        inventory.showItems();
    }
}
