package creationalpatterns.abstractfactory;

import creationalpatterns.abstractfactory.pc.ApplePC;
import creationalpatterns.abstractfactory.pc.DellPC;
import creationalpatterns.abstractfactory.pc.HybridPCBuild;
import creationalpatterns.abstractfactory.pc.PC;


/**
 * This Factory is "Factory For Factories" Which helps us get the Correct Family of Related Objects based on input.
 * From the Families of Related Object
 */
public class PCFactory {
    private PCFactory(){};
    public static PC getNewPCInstance(String pcType){
        PC pcImplementation = null;
        switch (pcType){
            case "apple":
                pcImplementation = new ApplePC();
                break;
            case "dell":
                pcImplementation = new DellPC();
                break;
            case "hybrid":
                pcImplementation = new HybridPCBuild();
                break;
        }
        return pcImplementation;
    }
}
