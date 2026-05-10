package A13;

public class StareExternat implements StarePacient {

    @Override
    public void interneaza(Pacient pacient) {
        System.out.println("Pacientul este reintenat.");
        pacient.setStare(new StareInternat());
    }

    @Override
    public void treceSubObservatie(Pacient pacient) {
        System.out.println("Pacientul este externat, nu poate trece sub observatie.");
    }

    @Override
    public void externeaza(Pacient pacient) {
        System.out.println("Pacientul este deja externat.");
    }

    @Override
    public String getStare() {
        return "Externat";
    }
}