package behaviouralpatterns.chainofresponsiblity;

import java.util.Random;

public class AuthenticationHandler extends BaseHandler {
    public AuthenticationHandler(BaseHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected boolean doHandle(HTTPRequest httpRequest) {
        boolean isUserCredentialsCorrect = new Random().nextBoolean();
        System.out.println("Checking UserName , Password Combo : " + isUserCredentialsCorrect);
        return isUserCredentialsCorrect;
    }
}
