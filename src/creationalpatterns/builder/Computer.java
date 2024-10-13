package creationalpatterns.builder;


/**
 * Follow This type of Builder for Creating POJO or Simple Representation of the Object.
 * This helps us constructing the POJO with Different representations ( Like : Computer with/without SecureEnclave, Computer with/without processorSpeed)
 * When the Creation of ComputerObject involves Complex Construction Steps for different representation ( Follow Builder Construction with Director Delegation )
 */
public class Computer {

    /*
      Cannot be Null
     */
    private float oSVersion;

    /*
      Can be Null
     */
    private float processorSpeed;

    /*
      Can be Null
     */
    private Object secureEnclave;


    /*
      Do This so that No ComputerInstance is Directly Created by Clients
     */
    private Computer(){};

    /*
      Do This so that Computer Instance is always created with Not Null Parameters
     */

    private Computer(float oSVersion){
        this.oSVersion = oSVersion;
    }

    public float getOSVersion() {
        return oSVersion;
    }

    public float getProcessorSpeed() {
        return processorSpeed;
    }

    public Object getSecureEnclave() {
        return secureEnclave;
    }


    public static class ComputerBuilder{

        private float processorSpeed;

        private float osVersion;
        private Object secureEnclave;
        public ComputerBuilder(float osVersion){
            this.osVersion = osVersion;
        }

        public ComputerBuilder setProcessorSpeed(float processorSpeed) {
            this.processorSpeed = processorSpeed;
            return this;
        }

        public ComputerBuilder setSecureEnclave(Object secureEnclave) {
            this.secureEnclave = secureEnclave;
            return this;
        }

        public Computer build(){
            Computer computerInstance =  new Computer(osVersion);
            computerInstance.processorSpeed = processorSpeed;
            computerInstance.secureEnclave = secureEnclave;

            return computerInstance;
        }

    }
}
