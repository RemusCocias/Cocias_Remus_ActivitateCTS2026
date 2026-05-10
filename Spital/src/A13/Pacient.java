package A13;

public class Pacient {

    private String nume;
    private StarePacient stare;

    public Pacient(String nume) {
        this.nume = nume;
        this.stare = new StareInternat();
        System.out.println("Pacientul " + nume + " a fost adus in spital. Stare initiala: " + stare.getStare());
    }

    public void setStare(StarePacient stare) {
        this.stare = stare;
    }

    public String getStare() {
        return stare.getStare();
    }

    public void interneaza() {
        stare.interneaza(this);
    }

    public void treceSubObservatie() {
        stare.treceSubObservatie(this);
    }

    public void externeaza() {
        stare.externeaza(this);
    }

    public void afiseazaStare() {
        System.out.println("Stare curenta " + nume + ": " + stare.getStare());
    }
}