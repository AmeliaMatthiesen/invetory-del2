package items.consumable;

public class HealthPotion extends Consumable {

    private final int healAmount;

    public HealthPotion(String name, int weight, double value, int potency, double duration, int healAmount) {
        super(name, weight, value, potency, duration);
        this.healAmount = healAmount;
    }

    @Override
    public void useItem() {

        printUsage();
        System.out.println(getName() + " används! Du återfår " + healAmount + " hälsopoäng.");
    }

    @Override
    public void use() {

        useItem();
    }

    public void describe() {
        System.out.println(getName() + " är en dryck som återställer " + healAmount + " hälsopoäng.");
    }
}
