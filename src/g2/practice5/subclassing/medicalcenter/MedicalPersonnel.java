package g2.practice5.subclassing.medicalcenter;

public class MedicalPersonnel {

    static int x = 10; //Elementos estáticos no se heredan.

    public String name;

    public void attend(Patient p){
        System.out.println("Estoy atendiendo al paciente " + p.name);
    }

    public void sendToRadiology(Patient p){
        System.out.println("Estoy remitiendo al paciente " + p.name + " a radiología.");
    }
}
