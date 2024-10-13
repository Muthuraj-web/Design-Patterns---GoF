package behaviouralpatterns.observer.push.producers;

import behaviouralpatterns.observer.push.consumers.Observer;

/**
 * Subject Refers to the Object ( Producer ) that wants to notify the change occurred to the Observers
 */
public interface Subject {
    void addObservers(Observer obs);
    void removeObserver(Observer obs);
    void notifyObservers(boolean value);
}
