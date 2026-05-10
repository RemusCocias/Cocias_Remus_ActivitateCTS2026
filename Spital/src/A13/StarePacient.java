package A13;

public interface StarePacient {

    void interneaza(Pacient pacient);

    void treceSubObservatie(Pacient pacient);

    void externeaza(Pacient pacient);

    String getStare();
}