package behaviouralpatterns.mediator;

public class Stand extends Colleague{
    private boolean standState;
    public Stand(Mediator mediator) {
        super(mediator);
    }
    public boolean isStandState() {
        return standState;
    }

    public void setStandState(boolean standState) {
        this.standState = standState;
        mediator.changed(this);
    }
}
