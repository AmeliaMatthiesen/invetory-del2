package items;

import interfaces.Equippable;

public abstract class Armor extends Item implements Equippable {
    
    private int defense;
    private int durability;

    public Armor(String name, int weight, double value, int defense, int durability) {
        super(name, weight, value); // Anropa superklassens konstruktor
        this.defense = defense;
        this.durability = durability;
    }

    public int getDefense() {
        return defense;
    }

    public int getDurability() {
        return durability;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    // Metod för att utrusta och avrusta föremål
    public abstract void equipItem();

    public abstract void unequipItem();
}
