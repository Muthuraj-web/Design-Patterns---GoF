package behaviouralpatterns.observer.push.producers;

import behaviouralpatterns.observer.push.consumers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Electricity implements Subject {

    private final List<Observer> observerList = new ArrayList<>();

    public void turnOffElectricitySupply(){
        notifyObservers(false);
    }

    public void turnOnElectricitySupply(){
        notifyObservers(true);
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
    public void notifyObservers(boolean value) {
        for(Observer observer:observerList){
            observer.consume(value);
        }
    }
}
