package A3;

public class Brancardier extends PersonalSpital {

    public Brancardier(String nume) {
        super(nume);
    }

    @Override
    public String getRol() {
        return "Brancardier";
    }
}