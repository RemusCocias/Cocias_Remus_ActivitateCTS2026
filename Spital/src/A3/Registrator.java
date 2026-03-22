package A3;

public class Registrator extends PersonalSpital {

    public Registrator(String nume) {
        super(nume);
    }

    @Override
    public String getRol() {
        return "Registrator";
    }
}