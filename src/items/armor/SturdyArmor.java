package items.armor;

import items.Armor;

public class SturdyArmor extends Armor {

    private final int defenseValue;

    public SturdyArmor(String name, int weight, double value, int defenseValue, int durability) {

        super(name, weight, value, defenseValue, durability);

        this.defenseValue = defenseValue;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getDamageDefense() {
        return this.defenseValue;
    }

    @Override
    public void equipItem() {
        System.out.println("Equipped: " + getName());
    }

    @Override
    public void unequipItem() {
        System.out.println("Unequipped: " + getName());
    }
}
