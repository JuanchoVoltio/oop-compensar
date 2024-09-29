package g2.practice5.subclassing.medicalcenter.tmp;

import g2.practice5.subclassing.medicalcenter.MedicalPersonnel;
import g2.practice5.subclassing.medicalcenter.Patient;

public class MedicWithoutOpenClosed extends MedicalPersonnel {

    final String FOCUS;

    public MedicWithoutOpenClosed(){
        this.FOCUS = "General";
    }

    public MedicWithoutOpenClosed(String focus, String name) {
        this.FOCUS = focus;
        super.name = name;
    }

    public void prescribe(Patient p){
        //TODO: Do something
    }

    @Override
    public void attend(Patient p) {
        super.attend(p);
        if (FOCUS.equals("Cardiologo")) {
            System.out.println("Le ordeno un electrocardiograma");
        } else if (FOCUS.equals("Neurologo")) {
            System.out.println("Le ordeno una Tomografía craneal");
        } else if (FOCUS.equals("Gastroenterologo")){
            System.out.println("Le ordeno una endoscopia");
        }else{
            System.out.println("No le ordeno exámenes particulares.");
        }
    }
}
