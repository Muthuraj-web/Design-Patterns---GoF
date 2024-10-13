package behaviouralpatterns.state;

import java.util.Iterator;

public class HowToUse {
    public static void main(String[] args) {
        /*
            Lets Say There Exists an Object need to act differently in different situations, How would you implement this
            Naive Way:
            ```
                public class TVRemote(){
                        public void handleButtonPress(String buttonType){
                            if(buttonType.equals("TV ON")){
                                //1) Initiate a ElectoMagnetic Connection
                                //2) Initiate Handshake with TV
                                //3) Communicate with TV to Setup Remote Connection
                            }
                            if(buttonType.equals("TV OF")){
                                //1) Initiate Handshake with TV
                                //2) Communicate with TV Protocol to Send TV OFF Command
                            }
                            if(buttonType.equals("Volume Up")){
                                //1) Communicate with Speaker Instance of TV
                                //2) Check the Current TV Volume
                                //3) Sets the TV volume by ( current volume + 1) and send the command to TV
                            }

                        }
                }
            ```

            The Above Implementation is Bad as it is unmaintainable containing a lot of if-else statement and containing
            unnecessary TVRemote's inner implementations also violating Open - Closed Principle

            Solution:
            1) Create an Interface that represents the work of TVRemote
            2) Have multiple Implementations that represents the work of each buttonType
            3) For each State ( That tell what work to do ) set the respective implementation in TVRemote invoke them

         */

        TVRemote tvRemote = new TVRemote();

        tvRemote.setRemoteActionState(new TVONRemoteButtonAction());
        tvRemote.handleButtonPress();

        tvRemote.setRemoteActionState(new TVVolumeUpRemoteButtonAction());
        tvRemote.handleButtonPress();

        tvRemote.setRemoteActionState(new TVOFFRemoteButtonAction());
        tvRemote.handleButtonPress();

    }
}
