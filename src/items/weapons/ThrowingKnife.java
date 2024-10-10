package items.weapons;

import items.Weapon;
import items.interfaces.MeleeWeapon;
import items.interfaces.RangeWeapon;

public class ThrowingKnife extends Weapon implements RangeWeapon, MeleeWeapon {

    private int ammunition;
    private double range;

    public ThrowingKnife(String name, int damage, double weight, int durability, int ammunition, double range) {
        super(name, damage, weight, durability, ammunition);
        this.ammunition = ammunition;
        this.range = range;
    }

    public int getAmmunition() {
        return ammunition;
    }

    @Override
    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    @Override
    public void setAmmunition(int ammunition) {
        if (ammunition < 0) {
            System.out.println("Ammunition kan inte vara negativ. Värdet förblir: " + this.ammunition);
        } else {
            this.ammunition = ammunition;
        }
    }

    @Override
    public void rangeAttack() {
        if (ammunition > 0) {
            System.out.println(getName() + " utför en avståndsattack! Skada: " + getDamage());
            ammunition--;
        } else {
            System.out.println(getName() + " har ingen ammunition kvar!");
        }
    }

    @Override
    public void meleeAttack() {
        System.out.println(getName() + " gör en närstridsattack! Skada: " + getDamage());
    }

    public void slashAttack() {
        System.out.println(getName() + " utför ett snitt! Skada: " + getDamage());
    }

    @Override
    public void equipItem() {
        System.out.println(getName() + " har utrustats.");
    }

    @Override
    public void unequipItem() {
        System.out.println(getName() + " har avväpnats.");
    }
}
