package A10;

public class Internare {

    private DatePacient datePacient;
    private int numarSalon;
    private int numarPat;
    private int numarZile;

    public Internare(DatePacient datePacient, int numarSalon, int numarPat, int numarZile) {
        this.datePacient = datePacient;
        this.numarSalon = numarSalon;
        this.numarPat = numarPat;
        this.numarZile = numarZile;
    }

    @Override
    public String toString() {
        return "Internare {" +
                "\n  " + datePacient +
                "\n  Salon: " + numarSalon +
                "\n  Pat: " + numarPat +
                "\n  Zile spitalizare: " + numarZile +
                "\n}";
    }
}