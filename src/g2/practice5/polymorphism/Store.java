package g2.practice5.polymorphism;

public class Store {
    public static void main(String[] args) {
        Drink energyDrink = new Drink(40, 350, "Toro Rosso");
        Vegetable carrot = new Vegetable(10, 80, "Juan 5 puntos");
        Clothing shirt = new Clothing(20000, 'M', "Lybais");
        Toy hotWheelsCar = new Toy("Hot Wheels", 5000, true);
        Item[] products = {energyDrink, carrot, shirt, hotWheelsCar};

//        System.out.println(Cashier.billWithStaticPolymorphism(carrot));
//        System.out.println(Cashier.billWithStaticPolymorphism(energyDrink));
//        System.out.println(Cashier.billWithStaticPolymorphism(shirt));

        System.out.println(Cashier.billWithDynamicPolymorphism(shirt));
        System.out.println(Cashier.billWithDynamicPolymorphism(carrot));
        System.out.println(Cashier.billWithDynamicPolymorphism(energyDrink));
    }

    public static void probandoVariablesDeReferencia(){
        Vegetable carrot = new Vegetable(10, 80, "Juan 5 puntos");
        Item item = carrot;

        item.label = "Finca cool";

        System.out.println(item.label);
        System.out.println(carrot.weight);
    }
}
