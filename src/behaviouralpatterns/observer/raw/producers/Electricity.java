package behaviouralpatterns.observer.raw.producers;

import behaviouralpatterns.observer.raw.consumers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Electricity implements Subject{

    private final List<Observer> observerList = new ArrayList<>();

    public void turnOffElectricitySupply(){
        notifyObservers();
    }

    @Override
    public void addObservers(Observer obs) {
        observerList.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        observerList.remove(obs);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(Observer::consume);
    }
}
