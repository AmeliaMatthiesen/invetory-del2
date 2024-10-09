package items;

import items.interfaces.Equippable;

public abstract class Weapon extends InventoryItem implements Equippable {

    // Privat attribut för att lagra skada orsakad av vapnet
    private int damage;
    // Privat attribut för att lagra attackhastigheten för vapnet
    private int attackSpeed;

    public Weapon(String name, int weight, double value, int damage, int attackSpeed) {
        super(name, weight, value);
        this.damage = damage; // Sätter vapnets skada
        this.attackSpeed = attackSpeed; // Sätter vapnets attackhastighet
    }

    public int getDamage() {
        return damage;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public void setDamage(int damage) {
        this.damage = damage; // Uppdaterar skadan för vapnet
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed; // Uppdaterar attackhastigheten för vapnet
    }

    // Abstrakt metod för att utrusta vapnet, måste implementeras av subklasser
    @Override
    public abstract void equipItem();

    // Abstrakt metod för att avväpna vapnet, måste implementeras av subklasser
    @Override
    public abstract void unequipItem();
}
