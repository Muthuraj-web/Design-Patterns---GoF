package structuralpatterns.bridge.abstraction;

import structuralpatterns.bridge.hierarchy1.Remote;
import structuralpatterns.bridge.hierarchy2.RemoteDisplay;


public class AdvancedTVRemote extends TVRemote{

    //Think The Remote Display as a Digital Cluster in TV Remote, Only AdvancedTV Remote Has this feature.
    RemoteDisplay tvRemoteDisplayObject;
    public AdvancedTVRemote(Remote tvRemoteObject,RemoteDisplay tvRemoteDisplayObject){
        super(tvRemoteObject);
        this.tvRemoteDisplayObject = tvRemoteDisplayObject;
    }
    public void setAmazonPrime(){
        tvRemoteObject.setChannelNumber(-1);
    }

    public void setNetflix(){
        tvRemoteObject.setChannelNumber(-2);
    }

    public void showRemoteDisplayInfo(){
        String tvRemoteDisplayInfo = tvRemoteDisplayObject.getTVRemoteDisplayInfo();
        System.out.println(tvRemoteDisplayInfo);
    }
}
