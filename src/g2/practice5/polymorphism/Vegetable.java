package g2.practice5.polymorphism;

public class Vegetable extends Item{
    double pricePerMeasurementUnit;
    double weight;

    public Vegetable(double pricePerMeasurementUnit, double weight, String label){
        super(label);
        this.pricePerMeasurementUnit = pricePerMeasurementUnit;
        this.weight = weight;
    }

    @Override
    public double getPrice(){
        return weight * pricePerMeasurementUnit;
    }
}
