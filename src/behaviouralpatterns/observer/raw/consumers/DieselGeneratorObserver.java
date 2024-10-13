package behaviouralpatterns.observer.raw.consumers;

import behaviouralpatterns.observer.raw.server.DieselGenerator;

public class DieselGeneratorObserver implements Observer{
    @Override
    public void consume() {
        new DieselGenerator().turnON();
    }
}
