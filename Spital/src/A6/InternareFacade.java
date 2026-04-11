package A6;

public class InternareFacade {

    private Pacient pacient;
    private Medic medic;
    private Salon salon;

    public InternareFacade(Pacient pacient, Medic medic, Salon salon) {
        this.pacient = pacient;
        this.medic = medic;
        this.salon = salon;
    }

    public void interneazaPacient() {
        System.out.println("=== Incepere proces internare pentru " + pacient.getNume() + " ===\n");

        if (!pacient.esteGrav()) {
            System.out.println("Internarea refuzata: pacientul nu este intr-o stare grava.");
            return;
        }

        if (!medic.confirmaInternarea()) {
            System.out.println("Internarea refuzata: medicul nu a confirmat internarea.");
            return;
        }

        if (!salon.existaPatLiber()) {
            System.out.println("Internarea refuzata: nu exista paturi libere.");
            return;
        }

        salon.ocupaPat();
        System.out.println("\nPacientul " + pacient.getNume() + " a fost internat cu succes.");
    }
}