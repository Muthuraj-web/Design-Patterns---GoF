package behaviouralpatterns.mediator;

public class Engine extends Colleague{
    private boolean engineState;
    private int currentGear;
    public Engine(Mediator mediator) {
        super(mediator);
    }

    public boolean getEngineState() {
        return engineState;
    }

    public void setEngineState(boolean engineState) {
        this.engineState = engineState;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }
}
