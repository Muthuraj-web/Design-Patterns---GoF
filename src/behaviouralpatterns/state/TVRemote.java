package behaviouralpatterns.state;

public class TVRemote {
    private TVRemoteButtonActions currentActionState;

    public void setRemoteActionState(TVRemoteButtonActions remoteActionState){
        this.currentActionState = remoteActionState;
    }

    public void handleButtonPress(){
        currentActionState.doAction();
    }

    public void handleDeactivate(){
        currentActionState.deactivateButton();
    }
}
