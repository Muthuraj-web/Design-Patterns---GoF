package structuralpatterns.bridge.hierarchy2;

import java.util.Arrays;
import java.util.List;

public class ToshibaRemoteDisplay implements RemoteDisplay{

    @Override
    public String getTVRemoteDisplayInfo() {
        return  "Channels are " + Arrays.toString(getChannelsList().toArray()) + "\n"
                + "Health Status " + getTVHealthStatus();
    }
    private String getTVHealthStatus() {
        //This makes call with TV setup Box and gets the Status;
        return "TV Status is Good";
    }
    private List<String> getChannelsList() {
        //This makes call with the TV Setup Box and gets List of Channel to show in Screen.
        return Arrays.asList("Sony Liv","Vijay TV","Sun TV","Pogo");
    }
}