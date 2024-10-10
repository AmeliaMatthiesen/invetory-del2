package items.consumable;

public class StaminaPotion extends Consumable {

    private final int staminaAmount;

    public StaminaPotion(String name, int weight, double value, int potency, double duration, int staminaAmount) {
        super(name, weight, value, potency, duration);
        this.staminaAmount = staminaAmount;
    }

    @Override
    public void useItem() {

        printUsage();
        System.out.println(getName() + " används! Du återfår " + staminaAmount + " stamina poäng.");
    }

    @Override
    public void use() {

        useItem();
    }
}
