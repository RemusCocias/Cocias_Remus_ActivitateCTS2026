package A3;

public class PersonalNonMedicalFactory implements AbstractPersonalFactory {

    private String tip;

    public PersonalNonMedicalFactory(String tip) {
        this.tip = tip;
    }

    @Override
    public PersonalSpital creeazaPersonal(String nume) {
        switch (tip) {
            case "Secretar":
                return new Secretar(nume);
            case "Registrator":
                return new Registrator(nume);
            default:
                throw new IllegalArgumentException("Tip non-medical necunoscut: " + tip);
        }
    }
}