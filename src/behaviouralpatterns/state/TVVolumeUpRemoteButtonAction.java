package behaviouralpatterns.state;

public class TVVolumeUpRemoteButtonAction implements TVRemoteButtonActions{
    @Override
    public void doAction() {
        //1) Communicate with Speaker Instance of TV
        //2) Check the Current TV Volume
        //3) Sets the TV volume by ( current volume + 1) and send the command to TV
    }

    @Override
    public void deactivateButton() {
        //1) Communicate with Speaker Instance of TV
        //2) Sends Command to deactivate TV Volume UP Button
    }
}
