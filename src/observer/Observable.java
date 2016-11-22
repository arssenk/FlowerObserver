package observer;

/**
 * Created by arsen on 22.11.16.
 */
public interface Observable {
    void addObserver (Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
