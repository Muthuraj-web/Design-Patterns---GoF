package creationalpatterns.singleton;

public class APIHandler {
    private APIHandler(){};

    private static APIHandler instance;

    /**
     * Using Synchronized Method to Ensure Only One Instance of the class {{@link APIHandler}}
     * is created When Multiple Clients Calls the getInstance() when No instance was created.
     * @return {{@link APIHandler}}
     */
    public synchronized static APIHandler getInstance(){
        if(instance==null){
            instance = new APIHandler();
        }
        return instance;
    }
}
