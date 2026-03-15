package A1;

public class Main{

    public static void main(String[] args){

        Pacient pacientSimple = new Pacient.Builder("Ion Popescu", "1900101123456")
                .build();

        Pacient pacientVIP = new Pacient.Builder("Maria Ionescu", "2850315654321")
                .cuPatRabatabil()
                .cuMicDejunInclus()
                .cuPapuciCamera()
                .cuHalatInterior()
                .build();

        Pacient pacientPartial = new Pacient.Builder("Gheorghe Stan", "1751220987654")
                .cuMicDejunInclus()
                .cuPapuciCamera()
                .build();

        System.out.println(pacientSimple);
        System.out.println();
        System.out.println(pacientVIP);
        System.out.println();
        System.out.println(pacientPartial);
    }
}