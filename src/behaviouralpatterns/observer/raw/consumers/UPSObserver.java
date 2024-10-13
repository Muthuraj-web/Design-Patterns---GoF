package behaviouralpatterns.observer.raw.consumers;

import behaviouralpatterns.observer.raw.server.UPS;

public class UPSObserver implements Observer{
    @Override
    public void consume() {
        new UPS().turnON();
    }
}
