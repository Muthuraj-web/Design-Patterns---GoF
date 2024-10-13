package behaviouralpatterns.observer.push.consumers;

import behaviouralpatterns.observer.push.server.UPS;

public class UPSObserver implements Observer {
    @Override
    public void consume(boolean value) {
        UPS ups = new UPS();
        if(value){
            ups.turnOFF();
        }
        else {
            ups.turnON();
        }
    }
}
