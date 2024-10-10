package items.weapons;

import items.Weapon;
import items.interfaces.RangeWeapon;

public class FastBow extends Weapon implements RangeWeapon {

    private int ammunition;
    private double range;

    public FastBow(String name, int damage, double weight, int durability, int ammunition, double range) {
        super(name, damage, weight, durability, ammunition);
        if (ammunition < 0) {
            throw new IllegalArgumentException("Ammunition kan inte vara negativ.");
        }
        this.range = range;
    }

    public int getAmmunition() {
        return ammunition;
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
    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    @Override
    public void rangeAttack() {
        if (ammunition > 0) {
            System.out.println(getName() + " utför en avståndsattack! Skada: " + getDamage());
            ammunition--;
        } else {
            System.out.println(getName() + " har ingen ammunition kvar! Kan inte utföra avståndsattack.");
        }
    }

    public void fastShotAttack() {
        if (ammunition > 0) {
            System.out.println(getName() + " utför en snabb skottattack! Skada: " + getDamage());
            ammunition--;
        } else {
            System.out.println(getName() + " har ingen ammunition kvar! Kan inte utföra snabb skottattack.");
        }
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
