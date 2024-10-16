package g2.practice5.polymorphism;

public class Toy extends Item{
    boolean isImported;

    double basePrice;

    public Toy(String label, double basePrice, boolean isImported) {
        super(label);
        this.isImported = isImported;
        this.basePrice = basePrice;
    }
}
