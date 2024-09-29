package g2.practice5.subclassing.medicalcenter;

public class Cardiologist extends Medic{
    public Cardiologist(String name) {
        super(name);
    }

    @Override
    public void attend(Patient p){
        super.attend(p);
        System.out.println("Le ordeno un electrocardiograma");
    }
}
