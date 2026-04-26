package A10;

public class DatePacient {

    private String nume;
    private String telefon;
    private String adresa;

    public DatePacient(String nume, String telefon, String adresa) {
        this.nume = nume;
        this.telefon = telefon;
        this.adresa = adresa;
    }

    public String getNume() {
        return nume;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getAdresa() {
        return adresa;
    }

    @Override
    public String toString() {
        return "DatePacient {" +
                "\n    Nume: " + nume +
                "\n    Telefon: " + telefon +
                "\n    Adresa: " + adresa +
                "\n  }";
    }
}