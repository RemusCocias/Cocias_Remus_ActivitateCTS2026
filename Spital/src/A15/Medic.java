package A15;

public class Medic {

    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    public void interneazaPacient(String numePacient)
    {
        System.out.println("Dr. " + nume + " interneaza pacientul: " + numePacient);
    }

    public void trateazaImediat(String numePacient)
    {
        System.out.println("Dr. " + nume + " trateaza imediat pacientul: " + numePacient);
    }
}