package A12;

public interface Subject {

    void aboneaza(Observer observer);

    void dezaboneaza(Observer observer);

    void notificaToti(String mesaj);
}