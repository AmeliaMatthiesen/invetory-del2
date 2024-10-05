package items;

import interfaces.Equippable;

public abstract class Weapon extends Item implements Equippable {

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
    public abstract void equipItem();

    public abstract void unequipItem();
}
