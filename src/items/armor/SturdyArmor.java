package items.armor;

import items.Armor; // Kontrollera att denna rad finns

public class SturdyArmor extends Armor {
    private final int defenseValue; // Fast försvars värde

    // Konstruktor
    public SturdyArmor(String name, int weight, double value, int defenseValue, int durability) {
        super(name, weight, value, defenseValue, durability); // Passa parametrar till superklassen
        this.defenseValue = defenseValue; // defenseValue sätts en gång
    }

    // Implementera getName()-metoden
    @Override
    public String getName() {
        return super.getName(); // Returnera namnet från superklassen
    }

    // Överskriv getDamageDefense()-metoden
    @Override
    public int getDamageDefense() {
        return this.defenseValue; // Returnera det fasta försvars värdet
    }

    // Implementera equipItem- och unequipItem-metoderna
    @Override
    public void equipItem() {
        System.out.println("Equipped: " + getName());
    }

    @Override
    public void unequipItem() {
        System.out.println("Unequipped: " + getName());
    }
}
