package items.consumable;

import items.InventoryItem;
import items.interfaces.Usable;

public abstract class Consumable extends InventoryItem implements Usable {

    private int potency;
    private double duration;

    public Consumable(String name, int weight, double value, int potency, double duration) {

        super(name, weight, value);
        this.potency = potency;
        this.duration = duration;
    }

    public int getPotency() {
        return potency;
    }

    public double getDuration() {
        return duration;
    }

    public void setPotency(int potency) {
        this.potency = potency;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public abstract void useItem();

    public void printUsage() {
        System.out.println("Using " + getName() + ": Potency = " + potency + ", Duration = " + duration + " seconds.");
    }
}
