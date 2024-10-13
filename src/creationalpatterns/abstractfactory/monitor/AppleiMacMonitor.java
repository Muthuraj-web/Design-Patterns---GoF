package creationalpatterns.abstractfactory.monitor;


/**
 * Implementation of Product Monitor
 */
public class AppleiMacMonitor implements Monitor{
    @Override
    public int[] getDimension() {
        return new int[]{2048, 756};
    }

    @Override
    public String getColor() {
        return "White";
    }
}
