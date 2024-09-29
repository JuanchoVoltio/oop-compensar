package g2.practice5.atm;

public class CajeroAutomático {

    BaseDeDatos baseDeDatos;

    CajeroAutomático(){
        this.baseDeDatos = new BaseDeDatos();
    }

    int consultarSaldo(String cedula){
        int saldo = -1;
        Cuenta resultado = baseDeDatos.consultarCuenta(cedula);

        if(resultado != null){
            saldo = resultado.saldo;
        }

        return saldo;
    }
}
