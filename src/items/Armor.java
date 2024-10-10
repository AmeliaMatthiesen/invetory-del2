package items;

public abstract class Armor {

    private final String name;
    private final int weight;
    private final double value;
    private final int defenseValue;
    private int durability;

    public Armor(String name, int weight, double value, int defenseValue, int durability) {
        this.name = name;
        this.weight = weight;
        this.value = value;
        this.defenseValue = defenseValue;
        this.durability = durability;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public double getValue() {
        return value;
    }

    public int getDefenseValue() {
        return defenseValue;
    }

    public int getDurability() {
        return durability;
    }

    public void repair(int amount) {
        this.durability += amount;
    }

    public abstract int getDamageDefense();

    public abstract void equipItem();

    public abstract void unequipItem();
}
