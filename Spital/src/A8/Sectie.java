package A8;

public class Sectie implements ComponentaSpital {

    private String nume;

    public Sectie(String nume) {
        this.nume = nume;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public void afiseaza(String indent) {
        System.out.println(indent + "|- Sectie: " + nume);
    }
}