package A13;

public class StareInternat implements StarePacient {

    @Override
    public void interneaza(Pacient pacient) {
        System.out.println("Pacientul este deja internat.");
    }

    @Override
    public void treceSubObservatie(Pacient pacient) {
        System.out.println("Pacientul trece in starea SubObservatie.");
        pacient.setStare(new StareSubObservatie());
    }

    @Override
    public void externeaza(Pacient pacient) {
        System.out.println("Pacientul trece in starea Externat.");
        pacient.setStare(new StareExternat());
    }

    @Override
    public String getStare() {
        return "Internat";
    }
}