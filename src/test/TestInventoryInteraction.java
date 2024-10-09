package test;

import items.Shop;
import items.Player;
import items.weapons.BigSword;
import items.consumable.HealthPotion;

public class TestInventoryInteraction { 

    public static void main(String[] args) {
        // Create a shop
        Shop shop = new Shop("Elixirs & Gear");
        
        // Create items available in the shop
        BigSword bigSword = new BigSword("Stort svärd", 10, 50.0, 25, 1);
        HealthPotion healthPotion = new HealthPotion("Hälsopotion", 1, 10.0, 20, 5, 50);

        // Add items to the shop
        shop.addItem(bigSword);
        shop.addItem(healthPotion);
        
        // Create a player
        Player player = new Player("Archer");

        // Display player's inventory before purchase
        player.displayInventory();

        // Player buys an item
        player.buyItem(bigSword, shop);

        // Display player's inventory after purchase
        player.displayInventory();

        // Player sells an item back to the shop
        player.sellItem(bigSword, shop);

        // Display player's inventory after selling the item
        player.displayInventory();
    }
}
