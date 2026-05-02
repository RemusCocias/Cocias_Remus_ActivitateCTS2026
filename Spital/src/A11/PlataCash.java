package A11;

public class PlataCash implements StrategiePlata {

    @Override
    public void proceseazaPlata(double suma) {
        System.out.println("Plata de " + suma + " RON procesata cash la casierie.");
    }
}