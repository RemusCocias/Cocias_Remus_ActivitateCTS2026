package A2;

public class Asistent extends PersonalSpital {

    public Asistent(String nume) {
        super(nume);
    }

    @Override
    public String getRol() {
        return "Asistent";
    }
}