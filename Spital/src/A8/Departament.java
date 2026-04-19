package A8;

import java.util.ArrayList;
import java.util.List;

public class Departament implements ComponentaSpital {

    private String nume;
    private List<ComponentaSpital> componente = new ArrayList<>();

    public Departament(String nume) {
        this.nume = nume;
    }

    public void adaugaComponenta(ComponentaSpital componenta) {
        componente.add(componenta);
    }

    public void eliminaComponenta(ComponentaSpital componenta) {
        componente.remove(componenta);
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public void afiseaza(String indent) {
        System.out.println(indent + "+ Departament: " + nume);
        for (ComponentaSpital componenta : componente) {
            componenta.afiseaza(indent + "   ");
        }
    }
}