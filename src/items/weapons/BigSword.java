package items.weapons;

import items.Weapon;
import items.interfaces.MeleeWeapon;

public class BigSword extends Weapon implements MeleeWeapon {

    public BigSword(String name, int weight, double value, int damage, int attackSpeed) {
        super(name, weight, value, damage, attackSpeed);
    }

    @Override
    public void equipItem() {
        System.out.println(getName() + " has been equipped.");
    }

    @Override
    public void unequipItem() {
        System.out.println(getName() + " has been unequipped.");
    }

    @Override
    public void meleeAttack() {
        System.out.println(getName() + " gör en vanlig närstridsattack med " + getDamage() + " i skada!");
    }

    public void bigSwingAttack() {
        System.out.println(getName() + " utför en kraftfull svingattack! Skadar alla fiender i närheten.");
    }


    public void describe() {
        System.out.println("Detta är ett stort svärd som ger " + getDamage() + " skada och har en attackhastighet på " + getAttackSpeed() + ".");
    }
}
