package A10;

import java.util.HashMap;
import java.util.Map;

public class DatePacientFactory {

    private static Map<String, DatePacient> cache = new HashMap<>();

    public static DatePacient getDatePacient(String nume, String telefon, String adresa) {
        if (!cache.containsKey(nume)) {
            System.out.println("Creare date noi pentru pacientul: " + nume);
            cache.put(nume, new DatePacient(nume, telefon, adresa));
        }
        else {
            System.out.println("Reutilizare date existente pentru pacientul: " + nume);
        }
        return cache.get(nume);
    }

    public static int getNrPacientiUnici() {
        return cache.size();
    }
}