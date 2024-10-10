package items.consumable;

public class DefencePotion extends Consumable {

    public DefencePotion(String name, int weight, double value, int potency, double duration) {
        super(name, weight, value, potency, duration);
    }

   
    public void addDefence() {
        System.out.println(getName() + " används! Försvaret ökar med " + getPotency() + " poäng.");
    }

    @Override
    public void useItem() {

        addDefence();
    }

    @Override
    public void use() {

        useItem();
    }
}
