package g2.practice5.atm;

public class Cuenta {
    String titular;
    String tipo;
    int saldo;

    Cuenta(){}

    Cuenta(String titular, String tipo, int saldo){
        this.titular = titular;
        this.tipo = tipo;
        this.saldo = saldo;
    }
}
