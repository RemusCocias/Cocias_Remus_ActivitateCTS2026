package A2;

public class PersonalSpitalFactory {

    public static PersonalSpital creeazaPersonal(TipPersonal tip, String nume) {
        switch (tip) {
            case Brancardier:
                return new Brancardier(nume);
            case Asistent:
                return new Asistent(nume);
            case Medic:
                return new Medic(nume);
            default:
                throw new IllegalArgumentException("Tip personal necunoscut: " + tip);
        }
    }
}