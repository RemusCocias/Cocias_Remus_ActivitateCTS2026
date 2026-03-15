package A2;

public class Brancardier extends PersonalSpital {

    public Brancardier(String nume) {
        super(nume);
    }

    @Override
    public String getRol() {
        return "Brancardier";
    }
}