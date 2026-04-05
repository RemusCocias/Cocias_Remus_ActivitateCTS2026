package A5;

public abstract class MedicamentSpital {

    public abstract void prezintaReteta();

    public void achizitioneazaMedicament() {
        prezintaReteta();
        System.out.println("Medicament achizitionat din spital.");
    }
}