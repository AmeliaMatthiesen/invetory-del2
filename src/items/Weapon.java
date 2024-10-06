package items;

import items.interfaces.Equippable; // Adjust the package path as necessary

public abstract class Weapon extends InventoryItem implements Equippable {

    private int damage;
    private int attackSpeed;

    public Weapon(String name, int weight, double value, int damage, int attackSpeed) {
        super(name, weight, value); // Anropa superklassens konstruktor
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() {
        return damage;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    // Metoder från equippable interface
    @Override
    public abstract void equipItem();

    @Override
    public abstract void unequipItem();
}
