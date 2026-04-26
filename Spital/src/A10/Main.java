package A10;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Internare> internari = new ArrayList<>();

        // Ion Popescu internat de 3 ori - datele personale se reutilizeaza
        DatePacient dateIon = DatePacientFactory.getDatePacient("Ion Popescu", "0721000001", "Str. Florilor 1");
        internari.add(new Internare(dateIon, 101, 2, 5));

        DatePacient dateIon2 = DatePacientFactory.getDatePacient("Ion Popescu", "0721000001", "Str. Florilor 1");
        internari.add(new Internare(dateIon2, 203, 1, 3));

        DatePacient dateIon3 = DatePacientFactory.getDatePacient("Ion Popescu", "0721000001", "Str. Florilor 1");
        internari.add(new Internare(dateIon3, 305, 4, 7));

        // Maria Pop internata de 2 ori
        DatePacient dateMaria = DatePacientFactory.getDatePacient("Maria Pop", "0722000002", "Str. Trandafirilor 5");
        internari.add(new Internare(dateMaria, 102, 3, 2));

        DatePacient dateMaria2 = DatePacientFactory.getDatePacient("Maria Pop", "0722000002", "Str. Trandafirilor 5");
        internari.add(new Internare(dateMaria2, 201, 2, 10));

        System.out.println("=== Lista Internari ===\n");
        for (Internare internare : internari) {
            System.out.println(internare);
        }

        System.out.println("Total internari: " + internari.size());
        System.out.println("Pacienti unici in memorie: " + DatePacientFactory.getNrPacientiUnici());
    }
}