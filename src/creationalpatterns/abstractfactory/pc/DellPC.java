package creationalpatterns.abstractfactory.pc;

import creationalpatterns.abstractfactory.MonitorFactory;
import creationalpatterns.abstractfactory.MouseFactory;
import creationalpatterns.abstractfactory.monitor.Monitor;
import creationalpatterns.abstractfactory.mouse.Mouse;


/**
 * Represents a Particular Family
 */
public class DellPC implements PC{
    @Override
    public Mouse getMouse() {
        return MouseFactory.getNewMouseInstance("logitech");

    }

    @Override
    public Monitor getMonitor() {
        return MonitorFactory.getNewMonitorInstance("dell");
    }
}
