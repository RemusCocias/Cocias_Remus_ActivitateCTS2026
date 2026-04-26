package A9;

public class InternareProxy implements ServiciuInternare {

    private InternareReala internareReala;

    public InternareProxy() {
        this.internareReala = new InternareReala();
    }

    @Override
    public void interneazaPacient(String nume, boolean areAsigurare) {
        if (!areAsigurare) {
            System.out.println("Internarea refuzata pentru " + nume + ": nu are asigurare de sanatate.");
            return;
        }
        System.out.println("Verificare asigurare pentru " + nume + ": OK.");
        internareReala.interneazaPacient(nume, areAsigurare);
    }
}