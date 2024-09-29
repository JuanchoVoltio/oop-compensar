package g2.practice5.atm;

public class NN {
    void imprimirRespuestaAlUsuarioConsultarSaldo(int saldo){
        if(saldo != -1){
            System.out.println("El saldo de su cuenta es de " + saldo);
        }else{
            System.out.println("Se equivocó de banco o le hackearon la cuenta, tírese al piso y ruede.");
        }
    }
}
