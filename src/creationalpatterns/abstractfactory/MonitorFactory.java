package creationalpatterns.abstractfactory;

import creationalpatterns.abstractfactory.monitor.AppleiMacMonitor;
import creationalpatterns.abstractfactory.monitor.DellMonitor;
import creationalpatterns.abstractfactory.monitor.Monitor;

public class MonitorFactory {
    private MonitorFactory(){};
    public static Monitor getNewMonitorInstance(String monitorType){
        Monitor monitorImplementation = null;
        switch (monitorType){
            case "apple":
                monitorImplementation = new AppleiMacMonitor();
                break;
            case "dell":
                monitorImplementation = new DellMonitor();
                break;
        }
        return monitorImplementation;
    }
}
