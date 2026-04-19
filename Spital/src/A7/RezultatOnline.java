package A7;

public class RezultatOnline extends RezultatDecorator {

    public RezultatOnline(RezultatService rezultatService) {
        super(rezultatService);
    }

    @Override
    public void publicaRezultat(String rezultat) {
        rezultatService.publicaRezultat(rezultat);
        publicaOnline(rezultat);
    }

    private void publicaOnline(String rezultat) {
        System.out.println("Rezultat publicat pe platforma online: " + rezultat);
    }
}