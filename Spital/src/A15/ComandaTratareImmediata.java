package A15;

public class ComandaTratareImediata implements Comanda {

    private Medic medic;
    private String numePacient;

    public ComandaTratareImediata(Medic medic, String numePacient)
    {
        this.medic = medic;
        this.numePacient = numePacient;
    }

    @Override
    public void executa()
    {
        medic.trateazaImediat(numePacient);
    }
}