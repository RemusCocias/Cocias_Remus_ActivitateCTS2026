package A14;

public abstract class ProcesInternare {

    // Template Method - ordinea pasilor este fixa
    public final void interneazaPacient(String numePacient)
    {
        System.out.println("=== Internare pacient: " + numePacient + " ===\n");
        analizeazaStareaPacientului();
        verificaDisponibilitateaSaloane();
        emiteFisaInternare(numePacient);
        System.out.println("\nProcesul de internare pentru " + numePacient + " a fost finalizat.");
    }

    protected abstract void analizeazaStareaPacientului();

    protected abstract void verificaDisponibilitateaSaloane();

    protected void emiteFisaInternare(String numePacient)
    {
        System.out.println("Fisa de internare emisa pentru: " + numePacient);
    }
}