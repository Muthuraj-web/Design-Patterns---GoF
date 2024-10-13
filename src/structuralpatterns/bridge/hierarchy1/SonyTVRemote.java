package structuralpatterns.bridge.hierarchy1;

public class SonyTVRemote implements Remote{
    private int channelNumber = 1;
    @Override
    public void turnON() {
        //This Communicates with Setup Box and Turn ON TV
        System.out.println("Turning ON TV");
    }
    @Override
    public void turnOff() {
        //This Communicates with Setup Box and Turn OFF TV
        System.out.println("Turning Off TV");
    }
    @Override
    public void setChannelNumber(int channelNumber) {
        //This Communicates with Setup Box and sets Channel Number and adds a reference here
        this.channelNumber = channelNumber;
    }
    @Override
    public int getChannelNumber() {
        //This return the Stored Channel Number
        return channelNumber;
    }
}
