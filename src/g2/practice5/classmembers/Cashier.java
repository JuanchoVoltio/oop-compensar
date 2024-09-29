package g2.practice5.classmembers;

public class Cashier {
    String name; //atributo de instancia
    final static double VAT = 1.19; //atributo de clase y es constante

    static int instances; //atributo de clase

    public Cashier(String name) {
        this.name = name;
        instances++;
    }

    String billTheClient(Product p){ //Método stateful
        return "Valor facturado: " + p.price * VAT + " \n[IVA del " + ((VAT * 100) - 100) + "%]\nHa sido atendido por " + this.name + ".";
    }

    static String quoteProduct(Product p){ //Método stateless
        return "Valor cotizado: " + p.price * VAT + " \n[IVA del " + ((VAT * 100) - 100) + "%].";
    }
}
