package behaviouralpatterns.visitor.visitor;

import behaviouralpatterns.visitor.element.Integer;
import behaviouralpatterns.visitor.element.List;
import behaviouralpatterns.visitor.element.String;

/**
 * QueueOperation Visitor Impl for Element Types, which queues the request
 */
public class QueueOperation implements Visitor{

    /**
     * QueueOperation for Integer Element Type
     */
    @Override
    public void visit(Integer integer) {
        System.out.println("Iam Going to Queue Integer for Some asynchronous Operations");
    }
    /**
     * QueueOperation for List Element Type
     */
    @Override
    public void visit(List list) {
        System.out.println("Iam Going to Queue List for Some asynchronous Operations");
        System.out.println("Adding List in Special Queue");
    }
    /**
     * QueueOperation for String Element Type
     */
    @Override
    public void visit(String string) {
        System.out.println("Iam Going to Queue String for Some asynchronous Operations");
    }
}
