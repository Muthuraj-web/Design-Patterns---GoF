package behaviouralpatterns.mediator;

public class Bike implements Mediator{
    private final Engine engine = new Engine(this);
    public final GearBox gearBox = new GearBox(this);
    public final InstrumentCluster instrumentCluster = new InstrumentCluster(this);
    public final Stand stand = new Stand(this);

    @Override
    public void changed(Colleague colleague) {
        if(colleague == gearBox){
            engine.setCurrentGear(gearBox.getGear());
            instrumentCluster.setCurrentGear(gearBox.getGear());
        } else if (colleague == stand) {
            engine.setEngineState(!stand.isStandState());
        }
    }
}
