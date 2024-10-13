package creationalpatterns.abstractfactory.monitor;


/**
 * Implementation of Product Monitor
 */
public class DellMonitor implements Monitor{

    @Override
    public int[] getDimension() {
        return new int[]{1024, 523};
    }

    @Override
    public String getColor() {
        return "Black";
    }
}
