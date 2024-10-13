package behaviouralpatterns.chainofresponsiblity;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HowToUse {
    public static void main(String[] args) {
        /*
        Let's say we have a request ( HTTPRequest for Simplicity but can be any) that needs to be processed by many different Independent Objects in a order like in a PipeLine
        In a naive way We will Construct a Class Webserver and add a method which will have all those Objects calling them sequentially like below
        ```
        virusHandler.checkForVirus(httprequest)
        authenticationHandler.authenticate(httprequest)
        loggerHandler.log(httprequest)
        ```

        The Above Implementation violates Single Responsibility Principle ( SRP ) and forces the WebServer to purely depend upon those Concrete Implementations.
        If in Future need to Add a Another Object in the PipeLine we need to come here and Change Violating Open / Closed Principle.

        We must make the Client to talk to the Interface Not The Concrete Class. by providing loose coupling between the objects

        That where Chain Of Responsibility kicks in , Where  we Have a Abstract Base called Handler and all those Independent Objects implementing it.
        This helps us to achieve loose coupling and Each Objects in the pipeline processes the httprequest and decides whether to pass the control to the nextObject in pipeline

        A Great Example for Visitor Pattern is JAVA FILTERS in Servlets
         */
        BaseHandler loggerHandler = new LoggerHandler(null);
        BaseHandler authenticationHandler = new AuthenticationHandler(loggerHandler);
        BaseHandler virusHandler = new VirusHandler(authenticationHandler);

        HTTPRequest httpRequest = getHTTPRequestObject();
        virusHandler.handle(httpRequest);
        httpRequest.closeConnection();
    }

    private static HTTPRequest getHTTPRequestObject(){
        Map<String,String> httpHeaders = new HashMap<>();
        httpHeaders.put("Content-Type","application/json");
        httpHeaders.put("Cookie", "skjfdbgjerlbgelrgberg");


        byte[] body = "{\"name\":\"John\", \"password\":\"Password@123\"}".getBytes();
        return new HTTPRequest(httpHeaders,body);

    }
}
