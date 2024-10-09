package items;

public abstract class Armor {
    private final String name;         // Name of the armor
    private final int weight;          // Weight of the armor
    private final double value;        // Value of the armor
    private final int defenseValue;    // Defense value of the armor
    private int durability;             // Durability of the armor

    public Armor(String name, int weight, double value, int defenseValue, int durability) {
        this.name = name;
        this.weight = weight;
        this.value = value;
        this.defenseValue = defenseValue; // Ensure defenseValue is set
        this.durability = durability;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight; // Getter for weight
    }

    public double getValue() {
        return value; // Getter for value
    }

    public int getDefenseValue() {
        return defenseValue; // Getter for defenseValue
    }

    public int getDurability() {
        return durability;
    }

    public void repair(int amount) {
        this.durability += amount; // Repair method to increase durability
    }

    public abstract int getDamageDefense(); // Abstract method to get damage defense

    public abstract void equipItem(); // Abstract method to equip item

    public abstract void unequipItem(); // Abstract method to unequip item
}
