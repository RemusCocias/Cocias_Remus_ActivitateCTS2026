package A5;

public class MedicamentFarmacie {

    private String nume;

    public MedicamentFarmacie(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void cumparaMedicament() {
        System.out.println("Medicament cumparat din farmacie fara reteta: " + nume);
    }
}