package g2.practice5.polymorphism;

public class Drink extends Item{
    double pricePerMeasurementUnit;
    double volume;

    public Drink(double pricePerMeasurementUnit, double volume, String label) {
        super(label);
        this.pricePerMeasurementUnit = pricePerMeasurementUnit;
        this.volume = volume;
    }

    @Override
    public double getPrice(){
        return volume * pricePerMeasurementUnit;
    }
}
