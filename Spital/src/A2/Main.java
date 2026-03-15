package A2;

public class Main {

    public static void main(String[] args) {
        PersonalSpital p1 = PersonalSpitalFactory.creeazaPersonal(TipPersonal.Brancardier, "Ion Ionescu");
        PersonalSpital p2 = PersonalSpitalFactory.creeazaPersonal(TipPersonal.Asistent, "Maria Pop");
        PersonalSpital p3 = PersonalSpitalFactory.creeazaPersonal(TipPersonal.Medic, "Dr. Popescu");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}