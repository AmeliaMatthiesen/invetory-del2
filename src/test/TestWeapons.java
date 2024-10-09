package test;

import items.weapons.BigSword;
import items.weapons.FastBow;
import items.weapons.ThrowingKnife;

public class testWeapons {

    public static void main(String[] args) {

        // Testa FastBow
        System.out.println("Testar FastBow:"); // Skriver ut att FastBow testas
        // Skapar en instans av FastBow med specifika parametrar
        FastBow fastBow = new FastBow("Rapid Fire Bow", 50, 2.5, 100, 10, 30.0);
        System.out.println("Initial ammunition: " + fastBow.getAmmunition()); // Visar initial ammunition
        fastBow.rangeAttack(); // Utför en distansattack
        System.out.println("Ammunition efter attack: " + fastBow.getAmmunition()); // Visar ammunition efter attack
        fastBow.equipItem(); // Utrusta bågen
        fastBow.unequipItem(); // Ta bort utrustning
        System.out.println(); // Skriver ut en tom rad för bättre läsbarhet

        // Testa BigSword
        System.out.println("Testar BigSword:"); // Skriver ut att BigSword testas
        // Skapar en instans av BigSword med specifika parametrar
        BigSword bigSword = new BigSword("Heavy Broadsword", 10, 500.0, 70, 5);
        System.out.println("Svärdets skada: " + bigSword.getDamage()); // Visar svärdets skada
        bigSword.meleeAttack(); // Utför en närstridsattack
        bigSword.bigSwingAttack(); // Utför en stor svingattack
        bigSword.equipItem(); // Utrusta svärdet
        bigSword.unequipItem(); // Ta bort utrustning
        System.out.println(); // Skriver ut en tom rad för bättre läsbarhet

        // Testa ThrowingKnife
        System.out.println("Testar ThrowingKnife:"); // Skriver ut att ThrowingKnife testas
        // Skapar en instans av ThrowingKnife med specifika parametrar
        ThrowingKnife knife = new ThrowingKnife("Stealth Knife", 25, 0.3, 80, 5, 10.0);
        System.out.println("Initial ammunition: " + knife.getAmmunition()); // Visar initial ammunition
        knife.rangeAttack(); // Utför en distansattack
        System.out.println("Ammunition efter attack: " + knife.getAmmunition()); // Visar ammunition efter attack
        knife.meleeAttack(); // Utför en närstridsattack
        knife.slashAttack(); // Utför en slashing attack
        knife.equipItem(); // Utrusta kniven
        knife.unequipItem(); // Ta bort utrustning
    }
}
