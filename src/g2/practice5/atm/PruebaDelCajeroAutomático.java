package g2.practice5.atm;

import java.time.LocalDate;

public class PruebaDelCajeroAutomático {
    public static void main(String[] args) {
        CajeroAutomático atm = new CajeroAutomático();
        NN mensajero = new NN();

        int saldo = atm.consultarSaldo("lt456sds");
        //mensajero.imprimirRespuestaAlUsuarioConsultarSaldo(saldo);


        System.out.println(Math.random() * 10);

    }
}
