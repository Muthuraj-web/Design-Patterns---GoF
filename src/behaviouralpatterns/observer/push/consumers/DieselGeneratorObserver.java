package behaviouralpatterns.observer.push.consumers;

import behaviouralpatterns.observer.push.server.DieselGenerator;

public class DieselGeneratorObserver implements Observer {
    @Override
    public void consume(boolean value) {
        DieselGenerator dieselGenerator =  new DieselGenerator();
        if(value){
            dieselGenerator.turnOFF();
        }else {
            dieselGenerator.turnON();
        }
    }
}
