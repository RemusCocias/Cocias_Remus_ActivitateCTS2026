package A8;

public class Main {

    public static void main(String[] args) {

        // Sectii individuale
        Sectie sectieCardiologie = new Sectie("Cardiologie");
        Sectie sectieNeurologie = new Sectie("Neurologie");
        Sectie sectieOrtopedie = new Sectie("Ortopedie");
        Sectie sectieRecuperare = new Sectie("Recuperare");
        Sectie sectieAnalizeBasic = new Sectie("Analize Basic");
        Sectie sectieAnalizeMedicale = new Sectie("Analize Medicale");

        // Departament Medicina Interna cu sectii
        Departament departamentMedicinaInterna = new Departament("Medicina Interna");
        departamentMedicinaInterna.adaugaComponenta(sectieCardiologie);
        departamentMedicinaInterna.adaugaComponenta(sectieNeurologie);

        // Departament Chirurgie cu sectii
        Departament departamentChirurgie = new Departament("Chirurgie");
        departamentChirurgie.adaugaComponenta(sectieOrtopedie);
        departamentChirurgie.adaugaComponenta(sectieRecuperare);

        // Departament Laborator cu subdepartament si sectii
        Departament subdepartamentAnalize = new Departament("Analize");
        subdepartamentAnalize.adaugaComponenta(sectieAnalizeBasic);
        subdepartamentAnalize.adaugaComponenta(sectieAnalizeMedicale);

        Departament departamentLaborator = new Departament("Laborator");
        departamentLaborator.adaugaComponenta(subdepartamentAnalize);

        // Spital - radacina arborelui
        Departament spital = new Departament("Spital Central");
        spital.adaugaComponenta(departamentMedicinaInterna);
        spital.adaugaComponenta(departamentChirurgie);
        spital.adaugaComponenta(departamentLaborator);

        // Afisare arbore
        System.out.println("=== Structura Spitalului ===\n");
        spital.afiseaza("");
    }
}