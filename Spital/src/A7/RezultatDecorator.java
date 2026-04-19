package A7;

public abstract class RezultatDecorator implements RezultatService {

    protected RezultatService rezultatService;

    public RezultatDecorator(RezultatService rezultatService) {
        this.rezultatService = rezultatService;
    }

    @Override
    public void publicaRezultat(String rezultat) {
        rezultatService.publicaRezultat(rezultat);
    }
}