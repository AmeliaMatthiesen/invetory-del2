package items.weapons;

import items.Weapon;
import items.interfaces.RangeWeapon;

public class FastBow extends Weapon implements RangeWeapon {

    private int ammunition; // Variabel för att hålla reda på hur mycket ammunition pilbågen har
    private double range; // Variabel för räckvidden på pilbågen

    public FastBow(String name, int damage, double weight, int durability, int ammunition, double range) {
        super(name, damage, weight, durability, ammunition); // Lägg till ammunition här
        if (ammunition < 0) { // Kontrollera att ammunitionen inte är negativ
            throw new IllegalArgumentException("Ammunition kan inte vara negativ.");
        }
        this.range = range; // Initiera räckvidden
    }

    public int getAmmunition() {
        return ammunition;
    }

    // Implementerar setAmmunition-metoden från RangeWeapon-gränssnittet
    @Override
    public void setAmmunition(int ammunition) {
        if (ammunition < 0) { // Säkerställ att ammunitionen inte kan vara negativ
            System.out.println("Ammunition kan inte vara negativ. Värdet förblir: " + this.ammunition);
        } else {
            this.ammunition = ammunition; // Sätter ammunitionen om den är positiv
        }
    }

    // Implementerar getRange-metoden från RangeWeapon-gränssnittet
    @Override
    public double getRange() {
        return range;
    }

    // Sätter räckvidden för pilbågen
    public void setRange(double range) {
        this.range = range;
    }
    
    // Implementerar rangeAttack-metoden från RangeWeapon-gränssnittet
    @Override
    public void rangeAttack() {
        if (ammunition > 0) { // Kontrollera att det finns ammunition
            System.out.println(getName() + " utför en avståndsattack! Skada: " + getDamage());
            ammunition--; // Minska ammunitionen med 1 efter attacken
        } else {
            System.out.println(getName() + " har ingen ammunition kvar! Kan inte utföra avståndsattack.");
        }
    }

    // En specifik attack för FastBow som utför en snabb skottattack
    public void fastShotAttack() {
        if (ammunition > 0) { // Kontrollera att det finns ammunition
            System.out.println(getName() + " utför en snabb skottattack! Skada: " + getDamage());
            ammunition--; // Minska ammunitionen med 1 efter attacken
        } else {
            System.out.println(getName() + " har ingen ammunition kvar! Kan inte utföra snabb skottattack.");
        }
    }

    // Implementerar equipItem-metoden från Equippable (ärvs via Weapon-klassen)
    @Override
    public void equipItem() {
        System.out.println(getName() + " har utrustats.");
    }
    
    // Implementerar unequipItem-metoden från Equippable (ärvs via Weapon-klassen)
    @Override
    public void unequipItem() {
        System.out.println(getName() + " har avväpnats.");
    }
}
