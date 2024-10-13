package behaviouralpatterns.observer.push;

import behaviouralpatterns.observer.push.consumers.DieselGeneratorObserver;
import behaviouralpatterns.observer.push.consumers.Observer;
import behaviouralpatterns.observer.push.consumers.UPSObserver;
import behaviouralpatterns.observer.push.producers.Electricity;

public class HowToUse {
    public static void main(String[] args) {
        /*
        When you got some change occurred in an Object or an event took place , you want to notify the changes to many Objects
        you can choose observer pattern, Observer Pattern Helps you achieve loose coupling between Producers and Consumers

        The Consumers need to Implement Observer Interface a method notify Which will act as a hook and invoked by the producer
        when a change occurs in them.

        Publishers Also can choose to pass their reference in them so that Consumers can read about the change in the Object.

        In this push Type of Observer Pattern We have just passed a Single value of that change for Simplicity, It can also be some Complex Object
         */
        Observer dieselGeneratorObserver = new DieselGeneratorObserver();
        Observer upsObserver = new UPSObserver();

        Electricity subject = new Electricity();
        subject.addObservers(dieselGeneratorObserver);
        subject.addObservers(upsObserver);

        subject.turnOffElectricitySupply();
        subject.turnOnElectricitySupply();
    }
}
