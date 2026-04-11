package A6;

public class Pacient {

    private String nume;
    private int nivelGravitate;

    public Pacient(String nume, int nivelGravitate) {
        this.nume = nume;
        this.nivelGravitate = nivelGravitate;
    }

    public String getNume() {
        return nume;
    }

    public boolean esteGrav() {
        System.out.println("Verificare gravitate pacient " + nume + "...");
        return nivelGravitate >= 5;
    }
}