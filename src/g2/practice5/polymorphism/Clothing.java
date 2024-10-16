package g2.practice5.polymorphism;

public class Clothing extends Item{
    double basePrice;
    char size = 'M';

    public Clothing(double basePrice, char size, String label) {
        super(label);
        this.basePrice = basePrice;
        this.size = size;
    }

    public double getPricePerSize(){
        return size == 'S' ? 7000 : 10000;
    }

    @Override
    public double getPrice(){
        return basePrice * getPricePerSize();
    }
}
