package A3;

public class Main {

    public static void main(String[] args) {

        AbstractPersonalFactory fabricaMedicala = new PersonalMedicalFactory("Medic");
        PersonalSpital medic = fabricaMedicala.creeazaPersonal("Dr. Popescu");

        AbstractPersonalFactory fabricaMedicala2 = new PersonalMedicalFactory("Asistent");
        PersonalSpital asistent = fabricaMedicala2.creeazaPersonal("Maria Pop");

        AbstractPersonalFactory fabricaMedicala3 = new PersonalMedicalFactory("Brancardier");
        PersonalSpital brancardier = fabricaMedicala3.creeazaPersonal("Ion Ionescu");

        AbstractPersonalFactory fabricaNonMedicala = new PersonalNonMedicalFactory("Secretar");
        PersonalSpital secretar = fabricaNonMedicala.creeazaPersonal("Ana Popa");

        AbstractPersonalFactory fabricaNonMedicala2 = new PersonalNonMedicalFactory("Registrator");
        PersonalSpital registrator = fabricaNonMedicala2.creeazaPersonal("Gheorghe Stan");

        System.out.println("=== Personal Medical ===");
        System.out.println(medic);
        System.out.println(asistent);
        System.out.println(brancardier);

        System.out.println("\n=== Personal Non-Medical ===");
        System.out.println(secretar);
        System.out.println(registrator);
    }
}