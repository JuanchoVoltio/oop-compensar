package g2.practice5.polymorphism;

public class Cashier {
    static String billWithStaticPolymorphism(Drink item){
        double finalPrice =  item.pricePerMeasurementUnit * item.volume;
        return "Final price for drink is: " + finalPrice;
    }

    static String billWithStaticPolymorphism(Vegetable item){
        double finalPrice =  item.pricePerMeasurementUnit * item.weight;
        return "Final price for vegetable is: " + finalPrice;
    }

    static String billWithStaticPolymorphism(Clothing item){
        double finalPrice =  item.basePrice + item.getPricePerSize();
        return "Final price for clothing is: " + finalPrice;
    }

    static String billWithDynamicPolymorphism(Item item){
//        double finalPrice = 0;
//
//        if (item instanceof Drink){
//            Drink d = (Drink) item;
//            finalPrice = d.pricePerMeasurementUnit * d.volume;
//        } else if (item instanceof Vegetable) {
//            Vegetable v = (Vegetable) item;
//            finalPrice = v.pricePerMeasurementUnit * v.weight;
//        } else if (item instanceof Clothing){
//            Clothing c = (Clothing) item;
//            finalPrice =  c.basePrice + c.getPricePerSize();
//        } else if (item instanceof Toy) {
//            Toy t = (Toy) item;
//            finalPrice = t.isImported ? t.basePrice * 1.1 : t.basePrice;
//        }

        return "Final price for item with label [" + item.label.toUpperCase() + "] is: " + item.getPrice();
    }
}
