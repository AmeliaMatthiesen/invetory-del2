package test;

import items.Player;
import items.Shop;
import items.consumable.HealthPotion;
import items.weapons.BigSword;

public class TestInventoryInteraction {

    public static void main(String[] args) {
        Shop shop = new Shop("Elixirs & Gear");

        BigSword bigSword = new BigSword("Stort svärd", 10, 50.0, 25, 1);
        HealthPotion healthPotion = new HealthPotion("Hälsopotion", 1, 10.0, 20, 5, 50);

        shop.addItem(bigSword);
        shop.addItem(healthPotion);

        Player player = new Player("Archer");

        player.displayInventory();

        player.buyItem(bigSword, shop);

        player.displayInventory();

        player.sellItem(bigSword, shop);

        player.displayInventory();
    }
}
