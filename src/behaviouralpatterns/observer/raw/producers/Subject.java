package behaviouralpatterns.observer.raw.producers;

import behaviouralpatterns.observer.raw.consumers.Observer;

public interface Subject {
    void addObservers(Observer obs);
    void removeObserver(Observer obs);
    void notifyObservers();
}
