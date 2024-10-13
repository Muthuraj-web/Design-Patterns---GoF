package behaviouralpatterns.mediator;

public class GearBox extends Colleague{
    private int gear;
    public GearBox(Mediator mediator) {
        super(mediator);
    }
    public void setGear(int gear){
        this.gear = gear;
        mediator.changed(this);
    }
    public int getGear() {
        return gear;
    }
}
