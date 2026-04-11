package A6;

public class Medic {

    private String nume;
    private boolean confirmat;

    public Medic(String nume, boolean confirmat) {
        this.nume = nume;
        this.confirmat = confirmat;
    }

    public boolean confirmaInternarea() {
        System.out.println("Verificare confirmare medic " + nume + "...");
        return confirmat;
    }
}