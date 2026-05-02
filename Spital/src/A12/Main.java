package A12;

public class Main {

    public static void main(String[] args) {

        SistemNotificari sistem = new SistemNotificari();

        Pacient ion = new Pacient("Ion Popescu");
        Pacient maria = new Pacient("Maria Pop");
        Pacient gheorghe = new Pacient("Gheorghe Stan");

        System.out.println("=== Abonare pacienti ===\n");
        sistem.aboneaza(ion);
        sistem.aboneaza(maria);
        sistem.aboneaza(gheorghe);

        // Prima urgenta - toti primesc notificare
        sistem.notificaToti("Virus gripal tip A depistat in oras. Purtati masca!");

        // Gheorghe se dezaboneaza
        System.out.println("\n=== Gheorghe Stan se dezaboneaza ===\n");
        sistem.dezaboneaza(gheorghe);

        // A doua urgenta - doar ion si maria primesc
        sistem.notificaToti("Epidemie de rujeola confirmata. Prezentati-va la vaccinare!");
    }
}