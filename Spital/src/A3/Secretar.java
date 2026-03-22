package A3;

public class Secretar extends PersonalSpital {

    public Secretar(String nume) {
        super(nume);
    }

    @Override
    public String getRol() {
        return "Secretar";
    }
}