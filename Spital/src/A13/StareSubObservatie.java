package A13;

public class StareSubObservatie implements StarePacient {

    @Override
    public void interneaza(Pacient pacient) {
        System.out.println("Pacientul este sub observatie, nu poate fi internat din nou.");
    }

    @Override
    public void treceSubObservatie(Pacient pacient) {
        System.out.println("Pacientul este deja sub observatie.");
    }

    @Override
    public void externeaza(Pacient pacient) {
        System.out.println("Pacientul trece in starea Externat.");
        pacient.setStare(new StareExternat());
    }

    @Override
    public String getStare() {
        return "SubObservatie";
    }
}