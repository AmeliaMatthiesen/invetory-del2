package items.consumable;

public class StaminaPotion extends Consumable {

    private final int staminaAmount;

    // Konstruktor
    public StaminaPotion(String name, int weight, double value, int potency, double duration, int staminaAmount) {
        super(name, weight, value, potency, duration);
        this.staminaAmount = staminaAmount;
    }

    // Implementera logik för att använda föremålet
    @Override
    public void useItem() {
        printUsage(); // Från Consumable
        System.out.println(getName() + " används! Du återfår " + staminaAmount + " stamina poäng.");
    }

    // Implementera metoden use() från Usable
    @Override
    public void use() {
        useItem(); // Anropar useItem när use() används
    }
}
