package test;

import items.consumable.DefencePotion;
import items.consumable.HealthPotion;
import items.consumable.StaminaPotion;

public class testConsumables {

    public static void main(String[] args) {
        HealthPotion healthPotion = new HealthPotion("Health Potion", 1, 10.0, 20, 5, 50);
        DefencePotion defencePotion = new DefencePotion("Defence Potion", 1, 10.0, 15, 5); // Ingen varaktighet för DefencePotion
        StaminaPotion staminaPotion = new StaminaPotion("Stamina Potion", 1, 10.0, 10, 5, 30);

        healthPotion.use();
        defencePotion.use();
        staminaPotion.use();
    }
}
