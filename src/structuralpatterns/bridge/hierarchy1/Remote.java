package structuralpatterns.bridge.hierarchy1;

public interface Remote {
    public void turnON();
    public void turnOff();
    public void setChannelNumber(int channelNumber);
    public int getChannelNumber();

}
