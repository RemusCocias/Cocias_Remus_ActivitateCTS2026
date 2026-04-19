package A7;

public class Main {

    public static void main(String[] args) {

        // Forma initiala - doar printat
        RezultatService rezultatPrintat = new RezultatPrintat();

        System.out.println("=== Forma initiala - doar printat ===");
        rezultatPrintat.publicaRezultat("Analiza sange - Ion Popescu");

        System.out.println();

        // Forma noua - printat + online (decorator adaugat)
        RezultatService rezultatOnline = new RezultatOnline(rezultatPrintat);

        System.out.println("=== Forma noua - printat + online ===");
        rezultatOnline.publicaRezultat("Analiza sange - Ion Popescu");

        System.out.println();

        // Revenire la forma initiala - scoatem decoratorul
        System.out.println("=== Revenire la forma initiala - doar printat ===");
        rezultatPrintat.publicaRezultat("Analiza sange - Ion Popescu");
    }
}