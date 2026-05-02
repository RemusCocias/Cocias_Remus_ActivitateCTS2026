package A12;

public class Pacient implements Observer {

    private String nume;

    public Pacient(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public void actualizeaza(String mesaj) {
        System.out.println("Notificare primita de " + nume + ": " + mesaj);
    }
}