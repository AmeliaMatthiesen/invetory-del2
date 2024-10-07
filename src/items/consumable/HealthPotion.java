package items.consumable;

public class HealthPotion extends Consumable {

    private final int healAmount;

    // Konstruktör
    public HealthPotion(String name, int weight, double value, int potency, double duration, int healAmount) {
        super(name, weight, value, potency, duration); // Anropa superklassens konstruktor
        this.healAmount = healAmount; // Sätt healAmount
    }

    // Implementera logik för att använda föremålet
    @Override
    public void useItem() {
        printUsage(); // Från Consumable
        System.out.println(getName() + " används! Du återfår " + healAmount + " hälsopoäng.");
    }

    // Implementera metoden use() från Usable
    @Override
    public void use() {
        useItem(); // Anropar useItem när use() används
    }

    // En enkel metod för att beskriva potionen
    public void describe() {
        System.out.println(getName() + " är en dryck som återställer " + healAmount + " hälsopoäng.");
    }
}
