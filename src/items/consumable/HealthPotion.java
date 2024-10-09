package items.consumable;

public class HealthPotion extends Consumable {

    private final int healAmount; // Attribut för att lagra mängden hälsopoäng som potionen ger

    public HealthPotion(String name, int weight, double value, int potency, double duration, int healAmount) {
        super(name, weight, value, potency, duration);
        this.healAmount = healAmount;  // Sätter healAmount för potionen
    }

    // Överskrivning av useItem-metoden från Consumable
    @Override
    public void useItem() {
        // Anropar printUsage för att visa användningsinformation
        printUsage();
        System.out.println(getName() + " används! Du återfår " + healAmount + " hälsopoäng.");
    }

    // Överskrivning av use-metoden från Usable
    @Override
    public void use() {
        // Kallar på useItem när use anropas
        useItem();
    }

    // Metod för att beskriva potionens effekt
    public void describe() {
        System.out.println(getName() + " är en dryck som återställer " + healAmount + " hälsopoäng.");
    }
}
