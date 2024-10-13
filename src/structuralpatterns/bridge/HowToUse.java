package structuralpatterns.bridge;

import structuralpatterns.bridge.abstraction.AdvancedTVRemote;
import structuralpatterns.bridge.abstraction.TVRemote;
import structuralpatterns.bridge.hierarchy1.SonyTVRemote;
import structuralpatterns.bridge.hierarchy2.ToshibaRemoteDisplay;

public class HowToUse {
    public static void main(String[] args) {


        TVRemote tvRemote = new TVRemote(new SonyTVRemote());
        tvRemote.turnON();
        tvRemote.decreaseChannelNumber();
        tvRemote.increaseChannelNumber();
        tvRemote.turnOff();


        AdvancedTVRemote advancedTVRemote = new AdvancedTVRemote(new SonyTVRemote(),new ToshibaRemoteDisplay());
        advancedTVRemote.turnON();
        advancedTVRemote.increaseChannelNumber();
        advancedTVRemote.decreaseChannelNumber();
        advancedTVRemote.setAmazonPrime();
        advancedTVRemote.setNetflix();
        advancedTVRemote.showRemoteDisplayInfo();

    }
}
