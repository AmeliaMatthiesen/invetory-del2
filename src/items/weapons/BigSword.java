package items.weapons;

import items.Weapon; // Se till att Weapon-klassen importeras
import items.interfaces.MeleeWeapon; // Se till att MeleeWeapon-gränssnittet importeras

public class BigSword extends Weapon implements MeleeWeapon {
    
    // Konstruktor
    public BigSword(String name, int weight, double value, int damage, int attackSpeed) {
        super(name, weight, value, damage, attackSpeed);
    }

    // Implementera equipItem från Weapon
    @Override
    public void equipItem() {
        System.out.println(getName() + " has been equipped.");
    }

    // Implementera unequipItem från Weapon
    @Override
    public void unequipItem() {
        System.out.println(getName() + " has been unequipped.");
    }

    // Implementera meleeAttack från MeleeWeapon interface
    @Override
    public void meleeAttack() {
        System.out.println(getName() + " gör en vanlig närstridsattack med " + getDamage() + " i skada!");
    }

    // Implementera bigSwingAttack, specifik metod för BigSword
    public void bigSwingAttack() {
        System.out.println(getName() + " utför en kraftfull svingattack! Skadar alla fiender i närheten.");
    }

    // Valfritt: Lägg till en beskrivning av svärdet
    public void describe() {
        System.out.println("Detta är ett stort svärd som ger " + getDamage() + " skada och har en attackhastighet på " + getAttackSpeed() + ".");
    }
}
