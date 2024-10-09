package items;

public abstract class InventoryItem {

    private String name;
    private int weight;
    private double value;

    public InventoryItem(String name, int weight, double value) {
        this.name = name;
        this.weight = weight;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public double getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setValue(double value) {
        this.value = value;
    }

    // Metod för att visa grundläggande information om föremålet
    public void displayInfo() {
        System.out.println("Item: " + name + ", Weight: " + weight + ", Value: " + value + " gold");
    }
}
