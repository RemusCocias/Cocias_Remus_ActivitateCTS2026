package A7;

public class RezultatPrintat implements RezultatService {

    @Override
    public void publicaRezultat(String rezultat) {
        System.out.println("Rezultat printat: " + rezultat);
    }
}