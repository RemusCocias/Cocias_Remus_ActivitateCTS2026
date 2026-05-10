package A14;

public class InternareStandard extends ProcesInternare {

    @Override
    protected void analizeazaStareaPacientului()
    {
        System.out.println("Analiza standard: stare stabila, internare planificata.");
    }

    @Override
    protected void verificaDisponibilitateaSaloane()
    {
        System.out.println("Verificare saloane standard: salon disponibil gasit.");
    }
}