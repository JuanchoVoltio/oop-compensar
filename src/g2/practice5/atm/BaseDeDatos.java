package g2.practice5.atm;

public class BaseDeDatos {
    Cuenta[] cuentas;

    BaseDeDatos(){
        this.cuentas = new Cuenta[3];
        cuentas[0] = new Cuenta("jd123", "ahorros", 300);
        cuentas[1] = new Cuenta("lt456", "ahorros", 200);
        cuentas[2] = new Cuenta("nx789", "ahorros", 400);
    }

    Cuenta consultarCuenta(String cedula){
        for(int i = 0; i < cuentas.length; i++){
            if(cuentas[i].titular.equals(cedula)){
                return cuentas[i];
            }
        }

        return null;
    }
}
