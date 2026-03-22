package A3;

public class PersonalMedicalFactory implements AbstractPersonalFactory {

    private String tip;

    public PersonalMedicalFactory(String tip) {
        this.tip = tip;
    }

    @Override
    public PersonalSpital creeazaPersonal(String nume) {
        switch (tip) {
            case "Medic":
                return new Medic(nume);
            case "Asistent":
                return new Asistent(nume);
            case "Brancardier":
                return new Brancardier(nume);
            default:
                throw new IllegalArgumentException("Tip medical necunoscut: " + tip);
        }
    }
}