package test; // Justera efter behov

import items.weapons.FastBow;
import items.weapons.BigSword; // Om den finns
import items.weapons.ThrowingKnife; // Om den finns


public class TestWeapons {

    public static void main(String[] args) {

        // Testa FastBow
        System.out.println("Testar FastBow:");
        FastBow fastBow = new FastBow("Rapid Fire Bow", 50, 2.5, 100, 10, 30.0);
        System.out.println("Initial ammunition: " + fastBow.getAmmunition());
        fastBow.rangeAttack();
        System.out.println("Ammunition efter attack: " + fastBow.getAmmunition());
        fastBow.equipItem();
        fastBow.unequipItem();
        System.out.println();

        // Testa BigSword
        System.out.println("Testar BigSword:");
        BigSword bigSword = new BigSword("Heavy Broadsword", 10, 500.0, 70, 5);
        System.out.println("Svärdets skada: " + bigSword.getDamage());
        bigSword.meleeAttack();
        bigSword.bigSwingAttack();
        bigSword.equipItem();
        bigSword.unequipItem();
        System.out.println();

        // Testa ThrowingKnife
        System.out.println("Testar ThrowingKnife:");
        ThrowingKnife knife = new ThrowingKnife("Stealth Knife", 25, 0.3, 80, 5, 10.0);
        System.out.println("Initial ammunition: " + knife.getAmmunition());
        knife.rangeAttack();
        System.out.println("Ammunition efter attack: " + knife.getAmmunition());
        knife.meleeAttack();
        knife.slashAttack();
        knife.equipItem();
        knife.unequipItem();
    }
}
