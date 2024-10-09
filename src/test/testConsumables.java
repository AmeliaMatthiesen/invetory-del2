package test;

import items.consumable.DefencePotion;
import items.consumable.HealthPotion;
import items.consumable.StaminaPotion;

public class testConsumables {

    public static void main(String[] args) {
        // Skapa instanser av potions med namn, vikt, värde, styrka och eventuell varaktighet
        HealthPotion healthPotion = new HealthPotion("Health Potion", 1, 10.0, 20, 5, 50);
        DefencePotion defencePotion = new DefencePotion("Defence Potion", 1, 10.0, 15, 5); // Ingen varaktighet för DefencePotion
        StaminaPotion staminaPotion = new StaminaPotion("Stamina Potion", 1, 10.0, 10, 5, 30);

        // Använd potions och visa deras effekter
        healthPotion.use(); // Använd hälso-potion
        defencePotion.use(); // Använd försvars-potion
        staminaPotion.use(); // Använd stamina-potion
    }
}
