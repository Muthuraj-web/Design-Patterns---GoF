package behaviouralpatterns.chainofresponsiblity;

import java.util.Arrays;

public class LoggerHandler extends BaseHandler {
    public LoggerHandler(BaseHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected boolean doHandle(HTTPRequest httpRequest) {
        System.out.println("This Simply logs your HTTPRequest ");
        System.out.println(Arrays.toString(httpRequest.getBody()));
        return true;
    }
}
