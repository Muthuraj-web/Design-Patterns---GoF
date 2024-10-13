package behaviouralpatterns.chainofresponsiblity;

import java.util.Random;

public class VirusHandler extends BaseHandler {
    public VirusHandler(BaseHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected boolean doHandle(HTTPRequest httpRequest) {
        boolean isVirusPresent = new Random().nextBoolean();
        System.out.println("Checking for Virus in HTTP body : " + isVirusPresent);
        return !isVirusPresent;
    }
}
