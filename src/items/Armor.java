package items;

public abstract class Armor {

    // Deklarerar privata attribut för rustningen
    private final String name;
    private final int weight;
    private final double value;
    private final int defenseValue;
    private int durability; // Hållbarhet för rustningen (kan ändras)

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

    // Metod för att reparera rustningen, ökar hållbarheten med det angivna beloppet
    public void repair(int amount) {
        this.durability += amount;  // Lägger till repair-amount till rustningens hållbarhet
    }

    // Abstrakt metod som kräver att alla subklasser specificerar hur skadan försvaras
    public abstract int getDamageDefense();

    // Abstrakt metod för att utrusta rustningen, måste implementeras i subklasser
    public abstract void equipItem();

    // Abstrakt metod för att avväpna rustningen, måste implementeras i subklasser
    public abstract void unequipItem();
}
