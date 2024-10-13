package behaviouralpatterns.state;

public class TVONRemoteButtonAction implements TVRemoteButtonActions {


    @Override
    public void doAction() {
        //1) Initiate a ElectoMagnetic Connection
        //2) Initiate Handshake with TV
        //3) Communicate with TV to Setup Remote Connection
    }

    @Override
    public void deactivateButton() {
        //1) Initiate Handshake with TV
        //3) Communicate with TV to deactivate TV Remote ON Button
    }
}
