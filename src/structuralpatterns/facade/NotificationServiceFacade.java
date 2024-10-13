package structuralpatterns.facade;

import structuralpatterns.facade.notificationlib.AuthToken;
import structuralpatterns.facade.notificationlib.Message;
import structuralpatterns.facade.notificationlib.NotificationService;
import structuralpatterns.facade.notificationlib.NotificationServiceAuthenticator;

public class NotificationServiceFacade {
    public static boolean sendNotification(String message,String username, String password, String ipAddress) throws Exception {
        Message messageObject = new Message(message);
        AuthToken authTokenObject = new NotificationServiceAuthenticator().authenticate(username,password);

        NotificationService notificationServiceObject = new NotificationService(authTokenObject,messageObject);
        return notificationServiceObject.sendNotification(ipAddress);
    }
}
