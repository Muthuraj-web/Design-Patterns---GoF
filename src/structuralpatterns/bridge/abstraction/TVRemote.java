package structuralpatterns.bridge.abstraction;

import structuralpatterns.bridge.hierarchy1.Remote;
import structuralpatterns.bridge.hierarchy2.RemoteDisplay;

public class TVRemote {

    Remote tvRemoteObject;

    public TVRemote(Remote tvRemoteObject){
        this.tvRemoteObject = tvRemoteObject;
    }

    public void turnON(){
        tvRemoteObject.turnON();
    }

    public void turnOff(){
        tvRemoteObject.turnOff();
    }

    public void increaseChannelNumber(){
        tvRemoteObject.setChannelNumber(tvRemoteObject.getChannelNumber() + 1);
    }

    public void decreaseChannelNumber(){
        tvRemoteObject.setChannelNumber(tvRemoteObject.getChannelNumber() - 1);
    }
}
