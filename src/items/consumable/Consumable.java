package items.consumable;

import items.InventoryItem;
import items.interfaces.Usable;

// Definierar en abstrakt klass Consumable som ärver från InventoryItem och implementerar Usable
public abstract class Consumable extends InventoryItem implements Usable {

    // Attribut för att lagra föremålets styrka och varaktighet
    private int potency;
    private double duration; // Varaktighet i sekunder

    public Consumable(String name, int weight, double value, int potency, double duration) {
        // Anropar superklassens (InventoryItem) konstruktor för att sätta namn, vikt och värde
        super(name, weight, value); // Anropa superklassens konstruktor
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

    // Abstrakt metod för att använda föremålet
    public abstract void useItem(); // Denna metod måste implementeras av subklasser

    // Metod för att skriva ut information om användningen av föremålet
    public void printUsage() {
        System.out.println("Using " + getName() + ": Potency = " + potency + ", Duration = " + duration + " seconds.");
    }
}
