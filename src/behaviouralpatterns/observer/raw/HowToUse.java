package behaviouralpatterns.observer.raw;

import behaviouralpatterns.observer.raw.consumers.DieselGeneratorObserver;
import behaviouralpatterns.observer.raw.consumers.Observer;
import behaviouralpatterns.observer.raw.consumers.UPSObserver;
import behaviouralpatterns.observer.raw.producers.Electricity;

public class HowToUse {
    public static void main(String[] args) {
        Observer dieselGeneratorObserver = new DieselGeneratorObserver();
        Observer upsObserver = new UPSObserver();

        Electricity subject = new Electricity();
        subject.addObservers(dieselGeneratorObserver);
        subject.addObservers(upsObserver);

        subject.turnOffElectricitySupply();
    }
}
