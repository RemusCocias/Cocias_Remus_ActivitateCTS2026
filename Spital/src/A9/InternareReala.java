package A9;

public class InternareReala implements ServiciuInternare {

    @Override
    public void interneazaPacient(String nume, boolean areAsigurare) {
        System.out.println("Pacientul " + nume + " a fost internat cu succes.");
    }
}