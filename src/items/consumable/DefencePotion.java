package items.consumable;

public class DefencePotion extends Consumable {

    public DefencePotion(String name, int weight, double value, int potency, double duration) {
        super(name, weight, value, potency, duration);
    }

    // Metod för att lägga till försvar
    public void addDefence() {
        System.out.println(getName() + " används! Försvaret ökar med " + getPotency() + " poäng.");
    }

    // Implementerar den abstrakta useItem-metoden från Consumable
    @Override
    public void useItem() {
        // Anropar addDefence när potionen används
        addDefence(); // Anropar addDefence när potionen används
    }

    // Metoden use() implementeras automatiskt från Usable via Consumable
    @Override
    public void use() {
        // Kallar på useItem när use anropas
        useItem(); // Kalla på useItem när use används
    }
}
