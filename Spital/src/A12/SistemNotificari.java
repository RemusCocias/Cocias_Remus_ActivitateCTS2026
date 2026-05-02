package A12;

import java.util.ArrayList;
import java.util.List;

public class SistemNotificari implements Subject {

    private List<Observer> abonati = new ArrayList<>();

    @Override
    public void aboneaza(Observer observer) {
        abonati.add(observer);
        System.out.println("Pacient abonat la notificari.");
    }

    @Override
    public void dezaboneaza(Observer observer) {
        abonati.remove(observer);
        System.out.println("Pacient dezabonat de la notificari.");
    }

    @Override
    public void notificaToti(String mesaj) {
        System.out.println("\nUrgenta: " + mesaj);
        System.out.println("Trimitere notificari catre " + abonati.size() + " pacienti...\n");
        for (Observer observer : abonati) {
            observer.actualizeaza(mesaj);
        }
    }
}