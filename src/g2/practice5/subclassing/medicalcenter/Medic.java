package g2.practice5.subclassing.medicalcenter;

import g2.practice5.subclassing.medicalcenter.MedicalPersonnel;
import g2.practice5.subclassing.medicalcenter.Patient;

public class Medic extends MedicalPersonnel {

    public Medic(String name) {
        super.name = name;
    }

    public void prescribe(Patient p){
        //TODO: Do something
    }
}
