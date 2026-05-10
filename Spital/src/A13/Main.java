package A13;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Gestiune Pacienti - State Pattern ===\n");

        Pacient ion = new Pacient("Ion Popescu");
        ion.afiseazaStare();

        System.out.println();

        // Stare grava - trece sub observatie
        ion.treceSubObservatie();
        ion.afiseazaStare();

        System.out.println();

        // Incearca sa il interneze din nou - nu se poate
        ion.interneaza();

        System.out.println();

        // Se vindeca - externat
        ion.externeaza();
        ion.afiseazaStare();

        System.out.println();

        // Incearca sa il treaca sub observatie dupa externare - nu se poate
        ion.treceSubObservatie();

        System.out.println();

        // Reinternare dupa externare
        ion.interneaza();
        ion.afiseazaStare();
    }
}