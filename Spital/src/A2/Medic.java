package A2;

public class Medic extends PersonalSpital {

    public Medic(String nume) {
        super(nume);
    }

    @Override
    public String getRol() {
        return "Medic";
    }
}