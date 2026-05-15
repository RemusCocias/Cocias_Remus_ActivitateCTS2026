package A15;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Command Pattern - Triaj Urgente ===\n");

        Medic medicIonescu = new Medic("Ionescu");
        Medic medicPopescu = new Medic("Popescu");

        OperatorTriaj operator = new OperatorTriaj();

        System.out.println("--- Operator primeste pacienti si adauga comenzi ---\n");

        operator.adaugaComanda(new ComandaInternare(medicIonescu, "Ion Popescu"));
        operator.adaugaComanda(new ComandaTratareImediata(medicPopescu, "Maria Pop"));
        operator.adaugaComanda(new ComandaInternare(medicPopescu, "Gheorghe Stan"));
        operator.adaugaComanda(new ComandaTratareImediata(medicIonescu, "Ana Popa"));

        operator.proceseazaComenzi();
    }
}