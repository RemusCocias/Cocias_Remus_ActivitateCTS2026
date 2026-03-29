package A4;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements Cloneable {

    private String nume;
    private Map<String, Double> solutii;

    public Reteta(String nume, Map<String, Double> solutii) {
        this.nume = nume;
        this.solutii = new HashMap<>(solutii);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Map<String, Double> getSolutii() {
        return solutii;
    }

    public void setSolutie(String solutie, double cantitate) {
        this.solutii.put(solutie, cantitate);
    }

    @Override
    public Reteta clone() {
        try {
            Reteta copie = (Reteta) super.clone();
            copie.solutii = new HashMap<>(this.solutii);
            return copie;
        }
        catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clonarea nu este suportata.", e);
        }
    }

    @Override
    public String toString() {
        return "Reteta {" +
                "\n  Nume: " + nume +
                "\n  Solutii: " + solutii +
                "\n}";
    }
}