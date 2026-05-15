package A15;

import java.util.LinkedList;
import java.util.Queue;

public class OperatorTriaj {

    private Queue<Comanda> coadaComenzi = new LinkedList<>();

    public void adaugaComanda(Comanda comanda)
    {
        coadaComenzi.add(comanda);
        System.out.println("Comanda adaugata in coada de catre operator.");
    }

    public void proceseazaComenzi()
    {
        System.out.println("\nOperatorul trimite comenzile catre medici...\n");
        while (!coadaComenzi.isEmpty())
        {
            Comanda comanda = coadaComenzi.poll();
            comanda.executa();
        }
    }
}