package g58414.atlg3.bmr.model.util;

public interface Observable {
    void register(Observer observer);
    void unregister (Observer observer);
    void notifyObserver();

}
