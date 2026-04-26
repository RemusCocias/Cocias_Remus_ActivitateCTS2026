package A9;

public class Main {

    public static void main(String[] args) {

        ServiciuInternare serviciu = new InternareProxy();

        System.out.println("=== Cereri de internare ===\n");

        serviciu.interneazaPacient("Ion Popescu", true);
        System.out.println();
        serviciu.interneazaPacient("Maria Pop", false);
        System.out.println();
        serviciu.interneazaPacient("Gheorghe Stan", true);
    }
}