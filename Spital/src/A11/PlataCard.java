package A11;

public class PlataCard implements StrategiePlata {

    private String numarCard;

    public PlataCard(String numarCard) {
        this.numarCard = numarCard;
    }

    @Override
    public void proceseazaPlata(double suma) {
        System.out.println("Plata de " + suma + " RON procesata cu cardul: " + numarCard);
    }
}