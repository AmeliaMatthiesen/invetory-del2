package test;

import items.armor.SturdyArmor;

public class testArmor {

    public static void main(String[] args) {
        testSturdyArmor();
    }

    public static void testSturdyArmor() {
        // Create an instance of SturdyArmor
        SturdyArmor armor = new SturdyArmor("Sturdy Armor", 15, 100.0, 50, 200);

        // Test getName()
        String name = armor.getName();
        System.out.println("Test getName(): " + name);
        assert "Sturdy Armor".equals(name) : "getName() failed";

        // Test getDurability()
        int durability = armor.getDurability();
        System.out.println("Test getDurability(): " + durability);
        assert durability == 200 : "getDurability() failed";

        // Test equipItem()
        System.out.println("Testing equipItem:");
        armor.equipItem();

        // Test unequipItem()
        System.out.println("Testing unequipItem:");
        armor.unequipItem();

        // Test repair()
        System.out.println("Before repair durability: " + armor.getDurability());
        armor.repair(50);
        System.out.println("After repair durability: " + armor.getDurability());
    }
}
