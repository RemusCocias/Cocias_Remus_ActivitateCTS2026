package A5;

public class MedicamentAdapter extends MedicamentSpital {

    private MedicamentFarmacie medicamentFarmacie;

    public MedicamentAdapter(MedicamentFarmacie medicamentFarmacie) {
        this.medicamentFarmacie = medicamentFarmacie;
    }

    @Override
    public void prezintaReteta() {
        System.out.println("Farmacia nu necesita reteta pentru: " + medicamentFarmacie.getNume());
    }

    @Override
    public void achizitioneazaMedicament() {
        medicamentFarmacie.cumparaMedicament();
    }
}