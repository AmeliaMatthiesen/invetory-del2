package items.consumable;

public class DefencePotion extends Consumable {

    // Konstruktor för DefencePotion
    public DefencePotion(String name, int weight, double value, int potency, double duration) {
        super(name, weight, value, potency, duration);  // Anropar superklassens konstruktor
    }

    // En enkel metod för att lägga till försvar
    public void addDefence() {
        System.out.println(getName() + " används! Försvaret ökar med " + getPotency() + " poäng.");
    }

    // Implementera den abstrakta useItem-metoden från Consumable
    @Override
    public void useItem() {
        addDefence(); // Anropar addDefence när potionen används
    }

    // use() implementeras automatiskt från Usable via Consumable
    @Override
    public void use() {
        useItem(); // Kalla på useItem när use används
    }
}
