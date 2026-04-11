package A6;

public class Salon {

    private String nume;
    private int paturiLibere;

    public Salon(String nume, int paturiLibere) {
        this.nume = nume;
        this.paturiLibere = paturiLibere;
    }

    public boolean existaPatLiber() {
        System.out.println("Verificare paturi libere in salonul " + nume + "...");
        return paturiLibere > 0;
    }

    public void ocupaPat() {
        if (paturiLibere > 0) {
            paturiLibere--;
            System.out.println("Pat ocupat in salonul " + nume + ". Paturi ramase: " + paturiLibere);
        }
    }
}