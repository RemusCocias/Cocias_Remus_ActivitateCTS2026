package A4;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Reteta originala creata de chimist
        Map<String, Double> solutiiOriginale = new HashMap<>();
        solutiiOriginale.put("Apa distilata", 200.0);
        solutiiOriginale.put("Alcool", 50.0);
        solutiiOriginale.put("Paracetamol", 10.0);

        Reteta retetaOriginala = new Reteta("Reteta Paracetamol", solutiiOriginale);

        // Clonare - fara a apela constructorul din nou
        Reteta retetaClonata1 = retetaOriginala.clone();
        retetaClonata1.setNume("Reteta Paracetamol - Varianta 2");
        retetaClonata1.setSolutie("Paracetamol", 20.0);

        Reteta retetaClonata2 = retetaOriginala.clone();
        retetaClonata2.setNume("Reteta Paracetamol - Varianta 3");
        retetaClonata2.setSolutie("Alcool", 30.0);

        System.out.println(" Reteta Originala ");
        System.out.println(retetaOriginala);

        System.out.println("\n Reteta Clonata 1 ");
        System.out.println(retetaClonata1);

        System.out.println("\n Reteta Clonata 2 ");
        System.out.println(retetaClonata2);
    }
}