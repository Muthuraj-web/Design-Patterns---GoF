package structuralpatterns.facade;

import structuralpatterns.facade.notificationlib.AuthToken;
import structuralpatterns.facade.notificationlib.Message;
import structuralpatterns.facade.notificationlib.NotificationService;
import structuralpatterns.facade.notificationlib.NotificationServiceAuthenticator;

public class HowToUse {
    public static void main(String[] args) {
        try{


            //############################### NAIVE IMPLEMENTATION ###############################//
            Message message = new Message("Hey User, Grab 50% Offer on All Products for Festive Sale");
            AuthToken authToken = new NotificationServiceAuthenticator().authenticate("username","Password@123");

            NotificationService notificationService = new NotificationService(authToken,message);
            notificationService.sendNotification("8.8.8.8");

            //############################### FACADE IMPLEMENTATION ###############################//
            NotificationServiceFacade.sendNotification(
                    "Hey User, Grab 50% Offer on All Products for Festive Sale",
                    "username",
                    "Password@123",
                    "8.8.8.8");

        } catch (Exception e){

        }
    }
}
