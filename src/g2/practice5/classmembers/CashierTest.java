package g2.practice5.classmembers;

public class CashierTest {
    public static void main(String[] args) {
        //Sólo existiría un cajero al momento de ir a pagar y recibir una factura.
        Product detergente = new Product("001", 100, "Detergente líquido");
        System.out.println("El impuesto es: " + Cashier.VAT);
        System.out.println(Cashier.quoteProduct(detergente));
        System.out.println("------");

        Cashier cajero1Bta = new Cashier("Harley");
        Cashier cajero2Bta = new Cashier("Kevin");
        Cashier cajero3Bquilla = new Cashier("María");
        Cashier cajero4Cali = new Cashier("Pedro");
//

        System.out.println(cajero1Bta.billTheClient(detergente));
        System.out.println("------");
        System.out.println("Instancias de la clase Cashier creadas: " + Cashier.instances);
        System.out.println("--- END ---");
    }
}
