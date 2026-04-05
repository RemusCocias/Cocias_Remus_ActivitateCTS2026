package A5;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Achizitie din sistemul Spitalului ===");
        MedicamentSpital medicamentSpital = new MedicamentSpital() {
            @Override
            public void prezintaReteta() {
                System.out.println("Reteta verificata pentru Paracetamol.");
            }
        };
        medicamentSpital.achizitioneazaMedicament();

        System.out.println("\n=== Achizitie prin Adapter (Farmacie integrata) ===");
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Ibuprofen");
        MedicamentSpital adapter = new MedicamentAdapter(medicamentFarmacie);
        adapter.achizitioneazaMedicament();
    }
}