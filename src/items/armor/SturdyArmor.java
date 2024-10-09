package items.armor;

import items.Armor;

// Definierar ett attribut för försvars värde
public class SturdyArmor extends Armor {
// Definierar ett attribut för försvars värde

    private final int defenseValue;

    public SturdyArmor(String name, int weight, double value, int defenseValue, int durability) {
        // Anropar superklassens (Armor) konstruktor för att sätta namn, vikt, värde, försvar och hållbarhet
        super(name, weight, value, defenseValue, durability);
        // Sätter det specifika försvars värdet för SturdyArmor
        this.defenseValue = defenseValue;
    }

    // Implementerar getName()-metoden från superklassen Armor
    @Override
    public String getName() {
        return super.getName();
    }

    // Överskriver getDamageDefense()-metoden från superklassen Armor
    @Override
    public int getDamageDefense() {
        return this.defenseValue;
    }

    // Implementerar equipItem()-metoden från Equippable-interfacet
    @Override
    public void equipItem() {
        System.out.println("Equipped: " + getName());
    }

    // Implementerar unequipItem()-metoden från Equippable-interfacet
    @Override
    public void unequipItem() {
        System.out.println("Unequipped: " + getName());
    }
}
