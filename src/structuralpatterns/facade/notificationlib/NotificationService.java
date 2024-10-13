package structuralpatterns.facade.notificationlib;

public class NotificationService {

    private AuthToken authToken;
    private Message message;

    public NotificationService(AuthToken authToken, Message message) {
        this.authToken = authToken;
        this.message = message;
    }

    public boolean sendNotification(String ipAddress){
        //This method uses the authToken, message, ipAddress to send notification
        return true;
    }
}
