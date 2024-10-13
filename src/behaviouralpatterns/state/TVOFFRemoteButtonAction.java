package behaviouralpatterns.state;

public class TVOFFRemoteButtonAction implements TVRemoteButtonActions{
    @Override
    public void doAction() {
        //1) Initiate Handshake with TV
        //2) Communicate with TV Protocol to Send TV OFF Command
    }

    @Override
    public void deactivateButton() {
        //1) Initiate Handshake with TV
        //2) Communicate with TV Protocol to deactivate TV OFF Button
    }
}
