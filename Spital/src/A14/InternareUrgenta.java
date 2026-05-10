package A14;

public class InternareUrgenta extends ProcesInternare {

    @Override
    protected void analizeazaStareaPacientului()
    {
        System.out.println("Analiza urgenta: stare critica confirmata. Prioritate maxima.");
    }

    @Override
    protected void verificaDisponibilitateaSaloane()
    {
        System.out.println("Verificare saloane urgenta: salon ATI rezervat imediat.");
    }

    @Override
    protected void emiteFisaInternare(String numePacient)
    {
        System.out.println("Fisa de internare urgenta emisa pentru: " + numePacient + " - ATI.");
    }
}