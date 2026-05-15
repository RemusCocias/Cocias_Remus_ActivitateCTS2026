package A15;

public class ComandaInternare implements Comanda {

    private Medic medic;
    private String numePacient;

    public ComandaInternare(Medic medic, String numePacient)
    {
        this.medic = medic;
        this.numePacient = numePacient;
    }

    @Override
    public void executa()
    {
        medic.interneazaPacient(numePacient);
    }
}