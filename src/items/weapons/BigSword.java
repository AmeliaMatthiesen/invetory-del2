package items.weapons;

import items.Weapon;
import items.interfaces.MeleeWeapon;

public class BigSword extends Weapon implements MeleeWeapon {

    public BigSword(String name, int weight, double value, int damage, int attackSpeed) {
        super(name, weight, value, damage, attackSpeed);
    }

    // Implementerar metoden equipItem() från Equippable (genom Weapon-klassen)
    @Override
    public void equipItem() {
        System.out.println(getName() + " has been equipped.");
    }

    // Implementerar metoden unequipItem() från Equippable (genom Weapon-klassen)
    @Override
    public void unequipItem() {
        System.out.println(getName() + " has been unequipped.");
    }

    // Implementerar meleeAttack() från MeleeWeapon-gränssnittet
    @Override
    public void meleeAttack() {
        System.out.println(getName() + " gör en vanlig närstridsattack med " + getDamage() + " i skada!");
    }
    // En specifik metod för BigSword som utför en kraftfull svingattack

    public void bigSwingAttack() {
        System.out.println(getName() + " utför en kraftfull svingattack! Skadar alla fiender i närheten.");
    }
    // Beskrivningsmetod som berättar mer om svärdets egenskaper

    public void describe() {
        System.out.println("Detta är ett stort svärd som ger " + getDamage() + " skada och har en attackhastighet på " + getAttackSpeed() + ".");
    }
}
