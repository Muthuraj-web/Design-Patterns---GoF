package structuralpatterns.facade.notificationlib;

import java.util.Random;

public class NotificationServiceAuthenticator {
    public AuthToken authenticate(String userName,String password) throws Exception{
        //Uses Username, Password to talk with Authenticator and get AuthToken,
        //If the Credentials are false throws Exception
        return new AuthToken(String.valueOf(new Random().nextDouble()));
    }
}
