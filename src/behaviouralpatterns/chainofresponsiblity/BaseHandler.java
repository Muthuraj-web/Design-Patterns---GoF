package behaviouralpatterns.chainofresponsiblity;

public abstract class BaseHandler{
    private BaseHandler nextHandler;
    public BaseHandler(BaseHandler nextHandler){
        this.nextHandler = nextHandler;
    }
    public final void handle(HTTPRequest httpRequest) {
        if(doHandle(httpRequest) && nextHandler!=null){
            System.out.println("Passing the Request to next Handler in the Chain");
            nextHandler.handle(httpRequest);
        }
    }
    abstract protected boolean doHandle(HTTPRequest httpRequest);
}
