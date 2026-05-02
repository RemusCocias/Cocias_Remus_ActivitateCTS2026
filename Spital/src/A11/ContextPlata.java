package A11;

public class ContextPlata {

    private StrategiePlata strategie;

    public ContextPlata(StrategiePlata strategie) {
        this.strategie = strategie;
    }

    public void setStrategie(StrategiePlata strategie) {
        this.strategie = strategie;
    }

    public void efectueazaPlata(double suma) {
        strategie.proceseazaPlata(suma);
    }
}