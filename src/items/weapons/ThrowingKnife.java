package items.weapons;

import items.Weapon;
import items.interfaces.MeleeWeapon;
import items.interfaces.RangeWeapon;

public class ThrowingKnife extends Weapon implements RangeWeapon, MeleeWeapon {

    private int ammunition; // Variabel för att hålla koll på hur många knivar som finns kvar (ammunition)
    private double range;   // Variabel för räckvidden på kastkniven

    public ThrowingKnife(String name, int damage, double weight, int durability, int ammunition, double range) {
        super(name, damage, weight, durability, ammunition);
        this.ammunition = ammunition; // Sätter ammunitionen
        this.range = range; // Sätter räckvidden
    }

    // Getter för att hämta antalet kvarvarande kastknivar (ammunition)
    public int getAmmunition() {
        return ammunition;
    }

    // Getter för att hämta räckvidden på kastkniven
    @Override
    public double getRange() {
        return range;
    }

    // Setter för att uppdatera räckvidden för kastkniven
    public void setRange(double range) {
        this.range = range;
    }

    // Setter för att uppdatera ammunitionen för kastkniven
    @Override
    public void setAmmunition(int ammunition) {
        if (ammunition < 0) { // Kontrollera att ammunitionen inte är negativ
            System.out.println("Ammunition kan inte vara negativ. Värdet förblir: " + this.ammunition);
        } else {
            this.ammunition = ammunition; // Sätt det nya ammunition-värdet
        }
    }

    // Implementerar rangeAttack-metoden från RangeWeapon-gränssnittet
    @Override
    public void rangeAttack() {
        if (ammunition > 0) { // Kontrollera om det finns ammunition
            System.out.println(getName() + " utför en avståndsattack! Skada: " + getDamage());
            ammunition--; // Minska ammunitionen med 1 efter varje kast
        } else {
            System.out.println(getName() + " har ingen ammunition kvar!"); // Om ammunitionen är slut
        }
    }

// Implementerar meleeAttack-metoden från MeleeWeapon-gränssnittet
    @Override
    public void meleeAttack() {
        System.out.println(getName() + " gör en närstridsattack! Skada: " + getDamage()); // Utför närstridsattack
    }

    // En specialiserad attack för ThrowingKnife som utför en snittattack
    public void slashAttack() {
        System.out.println(getName() + " utför ett snitt! Skada: " + getDamage()); // Utför en snittattack
    }

    // Implementerar equipItem-metoden från Equippable (ärvs via Weapon)
    @Override
    public void equipItem() {
        System.out.println(getName() + " har utrustats.");
    }

    // Implementerar unequipItem-metoden från Equippable (ärvs via Weapon)
    @Override
    public void unequipItem() {
        System.out.println(getName() + " har avväpnats.");
    }
}
