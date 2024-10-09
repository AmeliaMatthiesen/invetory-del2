package items.consumable;

public class StaminaPotion extends Consumable {

    private final int staminaAmount; // Attribut för att lagra mängden stamina som potionen ger

    public StaminaPotion(String name, int weight, double value, int potency, double duration, int staminaAmount) {
        super(name, weight, value, potency, duration);
        this.staminaAmount = staminaAmount; // Sätter staminaAmount för potionen
    }

    // Överskrivning av useItem-metoden från Consumable
    @Override
    public void useItem() {
        // Anropar printUsage för att visa användningsinformation
        printUsage();
        System.out.println(getName() + " används! Du återfår " + staminaAmount + " stamina poäng.");
    }

    // Överskrivning av use-metoden från Usable
    @Override
    public void use() {
        // Kallar på useItem när use anropas
        useItem();
    }
}
