package A6;

public class Main {

    public static void main(String[] args) {

        Pacient pacient1 = new Pacient("Ion Popescu", 7);
        Medic medic1 = new Medic("Dr. Ionescu", true);
        Salon salon1 = new Salon("Salon 101", 3);

        InternareFacade facade1 = new InternareFacade(pacient1, medic1, salon1);
        facade1.interneazaPacient();

        System.out.println();

        Pacient pacient2 = new Pacient("Maria Pop", 2);
        Medic medic2 = new Medic("Dr. Ionescu", true);
        Salon salon2 = new Salon("Salon 102", 2);

        InternareFacade facade2 = new InternareFacade(pacient2, medic2, salon2);
        facade2.interneazaPacient();

        System.out.println();

        Pacient pacient3 = new Pacient("Gheorghe Stan", 8);
        Medic medic3 = new Medic("Dr. Popescu", true);
        Salon salon3 = new Salon("Salon 103", 0);

        InternareFacade facade3 = new InternareFacade(pacient3, medic3, salon3);
        facade3.interneazaPacient();
    }
}