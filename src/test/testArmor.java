package test;

import items.armor.SturdyArmor;

public class testArmor {

    public static void main(String[] args) {
        testSturdyArmor();
    }

    public static void testSturdyArmor() {
        // Skapa en instans av SturdyArmor
        SturdyArmor armor = new SturdyArmor("Sturdy Armor", 15, 100.0, 50, 200);

        // Testa getName()
        String name = armor.getName();
        System.out.println("Test getName(): " + name);
        assert "Sturdy Armor".equals(name) : "getName() failed"; // Kontrollera att namnet stämmer

        // Testa getDurability()
        int durability = armor.getDurability();
        System.out.println("Test getDurability(): " + durability);
        assert durability == 200 : "getDurability() failed"; // Kontrollera att hållbarheten stämmer

        // Testa equipItem()
        System.out.println("Testing equipItem:");
        armor.equipItem(); // Utrusta rustningen

        // Testa unequipItem()
        System.out.println("Testing unequipItem:");
        armor.unequipItem(); // Ta av rustningen

        // Testa repair()
        System.out.println("Before repair durability: " + armor.getDurability()); // Hämta och skriv ut hållbarheten innan reparation
        armor.repair(50); // Repa rera rustningen med 50
        System.out.println("After repair durability: " + armor.getDurability()); // Hämta och skriv ut hållbarheten efter reparation
    }
}
