package A14;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Template Method Pattern - Internare Pacienti ===\n");

        ProcesInternare internareUrgenta = new InternareUrgenta();
        internareUrgenta.interneazaPacient("Ion Popescu");

        System.out.println();

        ProcesInternare internareStandard = new InternareStandard();
        internareStandard.interneazaPacient("Maria Pop");
    }
}