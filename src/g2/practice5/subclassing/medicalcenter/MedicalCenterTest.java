package g2.practice5.subclassing.medicalcenter;

public class MedicalCenterTest {
    public static void main(String[] args) {
//        Patient p = new Patient("Nero", "123abc");
//        Nurse enfermera = new Nurse();
//        Medic médico = new Medic();
//        Paramedic paramédico = new Paramedic();
//
////        enfermera.attend(p);
//        médico.attend(p);
////        paramédico.sendToRadiology(p);

        accionesUsuarioV3();
    }

    static void accionesUsuarioV1(){
        Patient p = new Patient("Nero", "123abc");
        MedicalPersonnel médico = new MedicalPersonnel();
        médico.attend(p);
    }

    static void accionesUsuarioV2(){
        Patient p = new Patient("Nero", "123abc");
        Medic médico = new Medic("Pepe");
        médico.attend(p);
    }

    static void accionesUsuarioV3(){
        Patient p = new Patient("Nero", "123abc");
        Cardiologist médico = new Cardiologist("Juancho");
        médico.attend(p);
    }
}
