package items.consumable;

public class HealthPotion extends Consumable {

    private int healAmount;

    // Konstruktör
    public HealthPotion(String name, int weight, double value, int potency, double duration) {
        super(name, weight, value, potency, duration); // Anropa superklassens konstruktor
    }

    // Getter
    public int getHealAmount() {
        return healAmount;
    }

    public void setHealAmount(int healAmount) {
        this.healAmount = healAmount;
    }

    // Implementera logik för att använda föremålet
    @Override
    public void useItem() {
        printUsage();
        System.out.println("Healing for " + healAmount + " health points!");
        // Här kan du lägga till logik för att återställa hälsan hos en spelare
    }
}
