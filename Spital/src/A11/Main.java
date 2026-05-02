package A11;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Modul de Plata Spital ===\n");

        // Pacient plateste cu cardul
        ContextPlata plataIon = new ContextPlata(new PlataCard("4111 1111 1111 1111"));
        System.out.print("Ion Popescu: ");
        plataIon.efectueazaPlata(750.0);

        // Pacient plateste cash
        ContextPlata plataMaria = new ContextPlata(new PlataCash());
        System.out.print("Maria Pop: ");
        plataMaria.efectueazaPlata(1200.0);

        // Pacient isi schimba metoda de plata la runtime
        System.out.println("\n--- Gheorghe Stan isi schimba metoda de plata ---");
        ContextPlata plataGheorghe = new ContextPlata(new PlataCash());
        System.out.print("Gheorghe Stan (initial cash): ");
        plataGheorghe.efectueazaPlata(500.0);

        plataGheorghe.setStrategie(new PlataCard("5500 0000 0000 0004"));
        System.out.print("Gheorghe Stan (schimbat card): ");
        plataGheorghe.efectueazaPlata(500.0);
    }
}