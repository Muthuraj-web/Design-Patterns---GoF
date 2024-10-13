package creationalpatterns.abstractfactory.pc;

import creationalpatterns.abstractfactory.monitor.Monitor;
import creationalpatterns.abstractfactory.mouse.Mouse;

/**
 * Base Representation of a Family of Related Products
 */

public interface PC{
    public Mouse getMouse();
    public Monitor getMonitor();

}
