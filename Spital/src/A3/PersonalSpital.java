package A3;

public abstract class PersonalSpital {

    private String nume;

    public PersonalSpital(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public abstract String getRol();

    @Override
    public String toString() {
        return getRol() + " { Nume: " + nume + " }";
    }
}