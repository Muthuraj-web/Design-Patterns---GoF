package behaviouralpatterns.mediator;

public class InstrumentCluster extends Colleague{
    private int currentGear;
    private int speed;
    public InstrumentCluster(Mediator mediator) {
        super(mediator);
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
        mediator.changed(this);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
